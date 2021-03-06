package com.m.cenarius;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    public static final int VERSION = 6;
    public static final int CACHE_SIZE = 500 * 1024 * 1024; // 500M

    /**
     * Container api pre-fix
     */
    public static final String CONTAINER_API_BASE = "http://cenarius-container/api";

    /**
     * Container widget pre-fix
     */
    public static final String CONTAINER_WIDGET_BASE = "cenarius://cenarius-container/widget";

    // disk中cenarius-routers.json文件
    public static final String DEFAULT_DISK_ROUTES_FILE_NAME = "cenarius-routes.json";
    // disk中cenarius-config.json文件
    public static final String DEFAULT_DISK_CONFIG_FILE_NAME = "cenarius-config.json";
    // 本地asset的存储目录
    public static final String DEFAULT_ASSET_FILE_PATH = "www";
    // 本地asset的zip
    public static final String DEFAULT_ASSET_ZIP_PATH = DEFAULT_ASSET_FILE_PATH + "/" + "www.zip";
    // 本地asset的routes.json
    public static final String PRESET_ROUTE_FILE_PATH = DEFAULT_ASSET_FILE_PATH + "/" + DEFAULT_DISK_ROUTES_FILE_NAME;
    // 本地asset的config.json
    public static final String PRESET_CONFIG_FILE_PATH = DEFAULT_ASSET_FILE_PATH + "/" + DEFAULT_DISK_CONFIG_FILE_NAME;
    // disk中缓存文件的存储目录
    public static final String CACHE_HOME_DIR = "cenarius";
    // disk中缓存目录
    public static final String DEFAULT_DISK_INTERNAL_FILE_PATH = DEFAULT_ASSET_FILE_PATH;

    public static final String SCHEMAS_FILE = "file";

    public static final String FILE_AUTHORITY = "file:///";

    // http 请求method
    public static final String KEY_METHOD = "_cenarius_method";
    // post 请求
    public static final String METHOD_POST = "POST";
    // get 请求
    public static final String METHOD_GET = "GET";



    public static final String MIME_TYPE_HTML = "text/html";
    public static final String MIME_TYPE_TEXT = "text/*";
    public static final String MIME_TYPE_CSS = "text/css";
    public static final String MIME_TYPE_JS1 = "text/javascript";
    public static final String MIME_TYPE_JS2 = "application/x-javascript";
    public static final String MIME_TYPE_JS3 = "application/javascript";
    public static final String MIME_TYPE_JS4 = "application/ecmascript";
    public static final String MIME_TYPE_JS5 = "text/ecmascript";
    public static final String MIME_TYPE_JSON = "application/json";
    public static final String MIME_TYPE_IMAGE = "image/*";

    public static final List<String> REPLACE_MIME_TYPE = new ArrayList<>();
    static {
        REPLACE_MIME_TYPE.add(MIME_TYPE_HTML);
        REPLACE_MIME_TYPE.add(MIME_TYPE_CSS);
        REPLACE_MIME_TYPE.add(MIME_TYPE_JS1);
        REPLACE_MIME_TYPE.add(MIME_TYPE_JS2);
        REPLACE_MIME_TYPE.add(MIME_TYPE_JS3);
        REPLACE_MIME_TYPE.add(MIME_TYPE_JS4);
        REPLACE_MIME_TYPE.add(MIME_TYPE_JS5);
        REPLACE_MIME_TYPE.add(MIME_TYPE_JSON);
    }

    public static final String EXTENSION_HTML = "html";
    public static final String EXTENSION_HTM = "htm";
    public static final String EXTENSION_CSS = "css";
    public static final String EXTENSION_JS = "js";
    public static final String EXTENSION_JPG = "jpg";
    public static final String EXTENSION_JPEG = "jpeg";
    public static final String EXTENSION_PNG = "png";
    public static final String EXTENSION_WEBP = "webp";
    public static final String EXTENSION_GIF = "gif";
    public static final List<String> CACHE_FILE_EXTENSION = new ArrayList<String>() {};
    static {
        CACHE_FILE_EXTENSION.add(EXTENSION_HTML);
        CACHE_FILE_EXTENSION.add(EXTENSION_HTM);
        CACHE_FILE_EXTENSION.add(EXTENSION_CSS);
        CACHE_FILE_EXTENSION.add(EXTENSION_JS);
        CACHE_FILE_EXTENSION.add(EXTENSION_JPG);
        CACHE_FILE_EXTENSION.add(EXTENSION_JPEG);
        CACHE_FILE_EXTENSION.add(EXTENSION_PNG);
        CACHE_FILE_EXTENSION.add(EXTENSION_WEBP);
        CACHE_FILE_EXTENSION.add(EXTENSION_GIF);
    }


    public static final int EVENT_CNRS_BASE = 20000;

    public static final int EVENT_CNRS_NETWORK_ERROR= EVENT_CNRS_BASE + 6;
    public static final int EVENT_CNRS_RETRY = EVENT_CNRS_BASE + 7;

    public static final String KEY_ERROR_TYPE = "key_error_type";

//    public static final int BUS_EVENT_ROUTE_CHECK_VALID = 1000;
//    public static final int BUS_EVENT_ROUTE_CHECK_INVALID = 2000;
//    public static final int BUS_EVENT_COPY_WWW_START = 6000;
//    public static final int BUS_EVENT_COPY_WWW = 6001;
//    public static final int BUS_EVENT_COPY_WWW_SUCCESS = 6002;
//    public static final int BUS_EVENT_COPY_WWW_ERROR = 6003;
//    public static final int BUS_EVENT_DOWNLOAD_FILE_SUCCESS = 7000;
//    public static final int BUS_EVENT_DOWNLOAD_FILE_ERROR = 7001;
//    public static final int BUS_EVENT_DOWNLOAD_ALL_FILE_SUCCESS = 7003;
    public static final int BUS_EVENT_UPDATE_STATE_AND_PROCESS = 8000;

    /**
     * 'Content-Encoding' header name
     */
    public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";

    /**
     * 'gzip' encoding header value
     */
    public static final String ENCODING_GZIP = "gzip";

    /**
     * Request Error PREFIX
     */
    public static final String ERROR_PREFIX = "_error_=";

    /**
     * Used return response code in Request Error
     */
    public static final String KEY_RESPONSE_CODE = "_response_code";

    /**
     * Used return response error in Request Error
     */
    public static final String KEY_RESPONSE_ERROR = "_response_error";

    /**
     * Used return network error in Request Error
     */
    public static final String KEY_NETWORK_ERROR = "_network_error";

    /**
     * Java call js function format with parameters
     */
    public static final String FUNC_FORMAT_WITH_PARAMETERS = "javascript:window.%s('%s')";

    /**
     * Java call js function format without parameters
     */
    public static final String FUNC_FORMAT = "javascript:window.%s()";



}
