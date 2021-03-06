package com.lorne.weixin.pay.api;

import com.lorne.weixin.pay.util.WeixinApiUtils;

import java.util.Map;

/**
 * app 支付
 * Created by yuliang on 2016/11/16.
 */
public class AppPay extends AbstractWxPay {

    @Override
    public Map<String, Object> createPay() {
        return WeixinApiUtils.createOrder(payInfo.getConfig(),payInfo.getTradeNo(), payInfo.getSubject(), payInfo.getBody(), payInfo.getPrice(), payInfo.getOpenId(), APP);
    }
}
