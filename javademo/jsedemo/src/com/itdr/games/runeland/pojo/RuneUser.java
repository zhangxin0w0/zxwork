package com.itdr.games.runeland.pojo;

/**
 * ClassName: RuneUser
 * 日期: 2019/11/26 11:00
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RuneUser {
    private String runame;
    private String psd;
    private Epigraph[] EPI = new Epigraph[30];

    public RuneUser(){

    }

    public RuneUser(String runame,String psd){
        this.runame = runame;
        this.psd = psd;
    }

    public Epigraph[] getEPI() {
        return EPI;
    }

    public void setEPI(Epigraph[] EPI) {
        this.EPI = EPI;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getRuname(){
        return this.runame;
    }
    public void setRuname(String name){
        this.runame = name;
    }
}
