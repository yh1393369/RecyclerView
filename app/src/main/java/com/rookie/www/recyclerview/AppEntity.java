package com.rookie.www.recyclerview;

/**
 * Created by Hi on 2017/2/16.
 */

public class AppEntity {

    private int appId;
    private String appName;

    public AppEntity(int appId, String appName){
        this.appId = appId;
        this.appName = appName;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
