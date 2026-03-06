package com.ykx.backend.model.dto;
import lombok.Data;

@Data
public class LoginFormDTO {
    private String phone;
    private String code;
    // 如果以后需要密码登录，直接在这里加 private String password; 即可
}
