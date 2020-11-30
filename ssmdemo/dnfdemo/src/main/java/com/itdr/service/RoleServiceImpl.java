package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.mapper.RoleMapper;
import com.itdr.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: RoleServiceImpl
 * 日期: 2020/11/9 14:24
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public ServerResponse insert(Role r, Integer uid) {
        // 1.查看当前用户下是否有同名角色
        Role ro = roleMapper.selectByUidAndNikeName(uid, r.getNikeName());
        if (ro != null) {
            return ServerResponse.toFailed("角色昵称已存在");
        }
        // 2.如果没有，就创建一个新角色
        int i = roleMapper.insert(r, uid);
        if (i <= 0) {
            return ServerResponse.toFailed("角色创建失败");
        }
        return ServerResponse.toSuccess("角色创建成功");

    }

    @Override
    public ServerResponse all(Integer uid) {
        List<Role> roleList = roleMapper.selectAll(uid);
        return ServerResponse.toSuccess(roleList);
    }
}
