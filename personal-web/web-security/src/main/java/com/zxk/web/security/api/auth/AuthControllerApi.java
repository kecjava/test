package com.zxk.web.security.api.auth;


import com.zxk.web.security.entity.LoginRequest;
import com.zxk.web.security.entity.LoginResult;
import com.zxk.web.security.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Administrator.
 */
@Api(value = "用户认证",description = "用户认证接口")
public interface AuthControllerApi {
    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest);

    @ApiOperation("退出")
    public ResponseResult logout();
}
