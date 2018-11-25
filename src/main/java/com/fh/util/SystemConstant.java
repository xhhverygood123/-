package com.fh.util;

public interface SystemConstant {
    String  LOGIN_VERIFICATION="verification";
    String LOGIN_USER="empDb";
    int LOGIN_STATE=1;
    int LOGIN_ERROR_COUNT=0;
    int LOGIN_ERROR_COUNT_PLUS=1;
    int LOGIN_ERROR_SUM=3;
    int LOGIN_COUNT=0;
    int LOGIN_COUNT_PLUS=1;


    String COS_SECRETID="AKID1wcAUeMYDgx2vhuhuz1rWecYKvMeNPyL";
    String COS_SECRETKEY="KVZS9fm6SkspkU3nMpL6g5QaZMzgQlZH";
    String COS_REGION_NAME="ap-chengdu";
    String COS_BUCKETNAME="xiaohuhui-1257061447";
    String COS_URL="https://xiaohuhui-1257061447.cos.ap-chengdu.myqcloud.com/";

    String REDIDS_CONNECT="192.168.20.104";//redis连接地址
}
