package com.sharism.album_server.utils;

/**
 * @author DYS
 * @Package com.sharism.file_server.utils
 * @Description: 设置数值
 * @date 2018/3/15-23:17
 * @Version: 1.0
 */
public class PublicValue {
    //照片删除
    public static final int PHOTO_DEL=1;

    //照片不删除
    public static final int PHOTO_NOT_DEL=0;
    /**
     * 以下信息是为了计算存储路径
     */
    //http
    public static final String HTTP="http://";
    //Tracker ip 地址
    public static final String TRACKER_IP="118.25.48.91";
    //Tracker Nginx 监听端口号
    public static final String TRACKER_NGINX_PORT="8000";
    //服务器地址长度  解析存储路径需要用到
    public static final int SERVER_ADDRESS_LENGTH=HTTP.length()+TRACKER_IP.length()+TRACKER_NGINX_PORT.length();
}
