package com.zte.level_46.backend.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

//自定义密码比较器
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {
    /**
     * @param token 用户界面输入的账号和密码
     * @param info  安全数据：用户对象user
     * @return
     */
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        //向下强转获得实现类
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //获取用户输入的密码
        String inputPwd = new String(upToken.getPassword());
        //获取认证类传入的安全认证对象密码
        String dbPwd = info.getCredentials().toString();
        //返回判断密码结果
        return dbPwd.equals(inputPwd);
    }
}

