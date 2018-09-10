package com.netx.common.pay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeChatInfo {

    //微信返回状态
    private String return_code;//返回状态码
    private String return_msg;//返回信息

    //return_code为SUCCESS
    private String mch_appid;//商户appid
    private String mchid;//商户号
    private String device_info;//设备号
    private String nonce_str;//随机字符串
    private String result_code;//业务结果
    private String err_code;//错误代码
    private String err_code_des;//错误代码描述

    //SUCCESS
    private String partner_trade_no;//商户订单号
    private String payment_no;//微信订单号
    private String payment_time;//微信支付成功时间



    private Logger logger = LoggerFactory.getLogger(WeChatInfo.class);

    private Pattern pattern = Pattern.compile("<!\\[CDATA\\[([A-Za-z0-9_\\-\\u4e00-\\u9fa5]+)\\]\\]>");

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getMch_appid() {
        return mch_appid;
    }

    public void setMch_appid(String mch_appid) {
        this.mch_appid = mch_appid;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getPartner_trade_no() {
        return partner_trade_no;
    }

    public void setPartner_trade_no(String partner_trade_no) {
        this.partner_trade_no = partner_trade_no;
    }

    public String getPayment_no() {
        return payment_no;
    }

    public void setPayment_no(String payment_no) {
        this.payment_no = payment_no;
    }

    public String getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(String payment_time) {
        this.payment_time = payment_time;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "WeChatInfo{" + "return_code='" + return_code + '\'' + ", return_msg='" + return_msg + '\'' + ", mch_appid='" + mch_appid + '\'' + ", mchid='" + mchid + '\'' + ", device_info='" + device_info + '\'' + ", nonce_str='" + nonce_str + '\'' + ", result_code='" + result_code + '\'' + ", err_code='" + err_code + '\'' + ", err_code_des='" + err_code_des + '\'' + ", partner_trade_no='" + partner_trade_no + '\'' + ", payment_no='" + payment_no + '\'' + ", payment_time='" + payment_time + '\'' + ", pattern=" + pattern + '}';
    }
}