package com.icloudcar.yukuai.core.auth;

import java.util.Date;

/**
 * 微信授权对象
 * Created by yuyidi on 2017/3/11.
 * package：com.icloudcar.yukuai.core.auth
 */
public class AuthToken {
    private String accessToken;
    private int expriesIn = 7200;
    private long exprexpiredTime;
    private long createTime;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpriesIn() {
        return expriesIn;
    }

    public void setExpriesIn(int expriesIn) {
        this.expriesIn = expriesIn;
    }

    public void setExpriesIn(int expriesIn, long createTime) {
        this.expriesIn = expriesIn;
        //获取当前时间毫秒数
        this.createTime = createTime - 60000;
        //设置下次过期时间 = 当前时间 + (凭证有效时间(秒) * 1000)
        this.exprexpiredTime = createTime + (expriesIn * 1000);
    }

    public long getCreateTime() {
        return createTime;
    }

    public boolean isExpriexpired(){
        Date now = new Date();
        long getTime = now.getTime();
        return getTime >= exprexpiredTime;
    }
}
