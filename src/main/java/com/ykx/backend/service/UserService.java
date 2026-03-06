package com.ykx.backend.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ykx.backend.model.dto.LoginFormDTO;
import com.ykx.backend.model.entity.User;

/**
* @author 13797
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2026-03-05 19:31:21
*/
public interface UserService extends IService<User> {
    void sendCode(String phone);
    String login(LoginFormDTO loginFormDTO);
}
