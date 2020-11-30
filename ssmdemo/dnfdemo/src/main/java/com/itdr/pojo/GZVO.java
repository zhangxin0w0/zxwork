package com.itdr.pojo;

import java.util.List;

/**
 * ClassName: GZVO
 * 日期: 2020/11/16 11:13
 *
 * @author Air张
 * @since JDK 1.8
 */
public class GZVO {
    private List all;
    private List suc;
    private List fail;

    public List getAll() {
        return all;
    }

    public void setAll(List all) {
        this.all = all;
    }

    public List getSuc() {
        return suc;
    }

    public void setSuc(List suc) {
        this.suc = suc;
    }

    public List getFail() {
        return fail;
    }

    public void setFail(List fail) {
        this.fail = fail;
    }
}
