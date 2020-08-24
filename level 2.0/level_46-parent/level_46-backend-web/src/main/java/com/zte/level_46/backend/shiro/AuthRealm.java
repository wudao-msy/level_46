package com.zte.level_46.backend.shiro;


import com.zte.level_46.entity.Sysuser;
import com.zte.level_46.service.SysuserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义realm域
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private SysuserService sysuserService;

    //授权：赋予用户角色
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 获取身份验证信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //获取用户名
        String username = (String)token.getPrincipal();
        //根据用户名获取User对象
         Sysuser sysuser = sysuserService.findByName(username);

        if(sysuser == null) {
            //找不到账号
            throw new UnknownAccountException();
        }

        //第一个参数：安全数据（user对象）
        //第二个参数：密码（数据库密码）
        //第三个参数：当前调用realm域的名称（类名即可）
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysuser, sysuser.getPassword(), this.getName());

        Session session = getSession();
        //将当前用户放进session
        session.setAttribute("username", username);
        /*
         * 返回身份验证信息，将交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
         * CredentialsMatcher使用盐加密传入的明文密码和此处的密文密码进行匹配
         */
        return info;
    }
    /**
     * 获取shiro封装的session
     */
    private Session getSession(){
        try{
            Subject subject = SecurityUtils.getSubject();
            Session session = subject.getSession(false);
            if (session == null){
                session = subject.getSession();
            }
            if (session != null){
                return session;
            }
        }catch (InvalidSessionException e){

        }
        return null;
    }

}

