package com.bcs.service;

import com.bcs.common.ServerResponse;

/**
 * ClassName: UrlService
 * 日期: 2020/8/13 16:20
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UrlService {
    ServerResponse getAll(Integer cid);
}
