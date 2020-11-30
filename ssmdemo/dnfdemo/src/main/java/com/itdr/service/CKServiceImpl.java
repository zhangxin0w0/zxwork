package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.mapper.CKMapper;
import com.itdr.mapper.DJMapper;
import com.itdr.pojo.CK;
import com.itdr.pojo.CKVO;
import com.itdr.pojo.DJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: CKServiceImpl
 * 日期: 2020/11/9 16:06
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class CKServiceImpl implements CKService {
    @Autowired
    CKMapper ckMapper;

    @Autowired
    DJMapper djMapperMapper;

    @Override
    public ServerResponse roleDJ(Integer roleId) {
        List<CKVO> ckvos = new ArrayList<>();

        // 1.获取当前角色仓库信息
        List<CK> ckList = ckMapper.selectByRid(roleId);
        // 2.根据仓库信息获取对应的商品信息
        for (CK ck : ckList) {
            DJ dj = djMapperMapper.selectById(ck.getDjid());
            if(dj == null){
                return ServerResponse.toFailed("道具不存在");
            }
            CKVO ckvo = new CKVO();
            ckvo.setCkid(ck.getId());
            ckvo.setDjid(dj.getId());
            ckvo.setDname(dj.getDname());
            ckvo.setDnum(ck.getDjnum());
            ckvos.add(ckvo);
        }
        // 3.返回数据：道具名称，道具数量
        return ServerResponse.toSuccess(ckvos);
    }
}
