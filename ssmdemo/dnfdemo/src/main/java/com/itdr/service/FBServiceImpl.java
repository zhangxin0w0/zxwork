package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.mapper.FBMapper;
import com.itdr.mapper.GZMapper;
import com.itdr.mapper.REXMapper;
import com.itdr.pojo.FB;
import com.itdr.pojo.GZ;
import com.itdr.pojo.GZVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: FBServiceImpl
 * 日期: 2020/11/9 15:52
 *
 * @author Air张
 * @since JDK 1.8
 */
@Service
public class FBServiceImpl implements FBService{
    @Autowired
    FBMapper fbMapper;

    @Autowired
    GZMapper gzMapper;

    @Autowired
    REXMapper rexMapper;

    private List getData(int x,String[] arr,List li){
        List lis = new ArrayList();
        for (int i = 0; i < x; i++) {
            int round = (int) Math.round((Math.random() * (arr.length-1)));
            String s = arr[round];
            lis.add(s);
            li.add(s);
        }

        return lis;
    }

    @Override
    public ServerResponse all() {
        List<FB> list = fbMapper.selectAll();
        return ServerResponse.toSuccess(list);
    }

    @Override
    public ServerResponse sjsj(Integer type, Integer lv) {
        // 创建一个存储最终数据的集合容器
        List li = new ArrayList();

        // 1.根据type找到对应的规则
        GZ gz = gzMapper.selectById(type);

        // 2.根据lv确定数据产生规则
        // 数量系数= n
        // 数据总量=lv*n
        // 错误数据量=lv
        // 正确数据量=(n-1)*lv
        // （正确数据量+错误数据量）<= 数据总量
        int n = gz.getNum();
        int y = (n-1)*lv;

        // 正确数据内容
        String[] sucArr = gz.getSuc().split(",");
        // 错误数据内容
        String[] failArr = gz.getFail().split(",");

        // 随机从上面的数据数组中取出任意个数据
        List failList = getData(lv, failArr, li);
        List sucList = getData(y, sucArr, li);

        Collections.shuffle(li);

        // 返回复合对象
        GZVO gzvo = new GZVO();
        gzvo.setAll(li);
        gzvo.setSuc(sucList);
        gzvo.setFail(failList);
        return ServerResponse.toSuccess(gzvo);
    }

    @Override
    public ServerResponse js(Integer lv, Integer fid, Integer rid, Integer uid) {
        // 1.确定经验和金币结算方法
        FB fb = fbMapper.selectById(fid);
        Integer dj = fb.getDj(); // 副本等级
        Integer exe = fb.getExe(); // 副本经验系数
        Integer money = fb.getMoney(); // 副本金币系数
        // 生成一个规则
        int m = dj*exe*lv; // 计算出来的经验
        int n = dj*money*lv; // 计算出来的金币


        // 2.判断角色等级是否有变化
        // 如果复杂一点，还要有一个升级的算法

        // 3.确定收益后，更新到当前角色数据中
        int i = rexMapper.updateOne(uid,rid,m,n);
        if(i<=0){
            return ServerResponse.toFailed("角色收益数据出错");
        }

        return ServerResponse.toSuccess("角色收益更新成功");
    }
}
