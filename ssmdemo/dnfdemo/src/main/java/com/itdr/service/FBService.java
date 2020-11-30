package com.itdr.service;

import com.itdr.common.ServerResponse;

/**
 * ClassName: FBService
 * 日期: 2020/11/9 15:52
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface FBService {
    ServerResponse all();

    ServerResponse sjsj(Integer type, Integer lv);

    ServerResponse js(Integer lv, Integer fid, Integer rid, Integer uid);
}
