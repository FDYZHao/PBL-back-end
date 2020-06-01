package com.pbl.backend.constant;

import com.zhazhapan.modules.constant.ValueConsts;

/**
 * @author: 杜东方
 * @date: 2020/5/24
 * @description:
 */
public class ConfigConstants {

    /**
     * 上传路径在全局中的路径
     */
    public static final String UPLOAD_PATH_OF_SETTING = "uploadPath";

    /**
     * 文件管理，配置文件路径
     */
    public static final String FILE_MANAGE_SETTING_PATH = "/file_manage_config.json";

    /**
     * 冒号
     */
    public static final String COLON = ":";

    /**
     * 默认存储路径
     */
    public static final String STORAGE_PATH = ValueConsts.USER_HOME + ValueConsts.SEPARATOR + "Desktop" + ValueConsts
            .SEPARATOR;

    /**
     * 最大上传大小路径
     */
    public static final String[] FILE_MAX_SIZE_OF_SETTING = {"file", "maxSize"};
}
