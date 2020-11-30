package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.Role;

/**
 * ClassName: RoleSevice
 * 日期: 2020/11/9 14:24
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface RoleService {
    ServerResponse insert(Role r, Integer uid);

    ServerResponse all(Integer id);
}
