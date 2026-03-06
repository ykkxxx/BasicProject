package com.ykx.backend.model.vo;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户视图对象（对外返回数据，不包含敏感信息）
 */
@Data
public class UserVO implements Serializable {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户角色
     */
    private String user_role;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新时间
     */
    private Date update_time;

    private static final long serialVersionUID = 1L;
}

