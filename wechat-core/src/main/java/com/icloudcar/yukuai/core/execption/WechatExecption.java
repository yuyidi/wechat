package com.icloudcar.yukuai.core.execption;

/**
 * 微信运行时异常
 * Created by yuyidi on 2017/3/3.
 * package：com.icloudcar.yukuai.core.execption
 */
public class WechatExecption extends Exception {


    public WechatExecption(String message) {
        super(message);
    }

    public WechatExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public WechatExecption(Throwable cause) {
        super(cause);
    }
}
