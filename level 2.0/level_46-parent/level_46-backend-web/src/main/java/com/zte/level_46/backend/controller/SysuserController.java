package com.zte.level_46.backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zte.level_46.constants.Constant;
import com.zte.level_46.entity.Sysuser;
import com.zte.level_46.service.SysuserService;
import com.zte.level_46.utils.ResponseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:msy
 * Date:2020-06-26 14:05
 * Description:<描述>
 */
@Controller
@RequestMapping("/backend/sysuser")
public class SysuserController {
    @Autowired
    private SysuserService sysuserService;

    @RequestMapping("/login")
    public String login(String name, String password){
        try {
            //1.得到subject对象
            Subject subject = SecurityUtils.getSubject();
            //2.封装用户数据
            AuthenticationToken token = new UsernamePasswordToken(name, password);
            //3.实现登录操作
            subject.login(token);
            //4.登录成功后，可以从shiro取出用户信息
            Sysuser sysuser = (Sysuser) subject.getPrincipal();
            //返回视图名
            return "main";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "login";

        }
    }

    //退出
    @RequestMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "/login.jsp";
    }

    @RequestMapping("/findAll")
    public String findAll(Integer pageNum,Model model){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= Constant.PAGE_NUM;
        }
        PageHelper.startPage(pageNum,2);
        List<Sysuser> sysusers = sysuserService.findAll();
        PageInfo<Sysuser> pageInfo = new PageInfo<>(sysusers);
        model.addAttribute("pageInfo",pageInfo);
        return "sysuserManager";

    }

    @RequestMapping("/add")
    public String add(Sysuser sysuser, Model model){
        try {
            sysuserService.add(sysuser);
            model.addAttribute("successMsg","注册成功");
        } catch (Exception e) {
            //e.printStackTrace();
            model.addAttribute("errorMsg","注册失败");
        }
        return "/login.jsp";

    }

    @RequestMapping("/checkName")
    @ResponseBody
    public Map<String,Object> checkName(String name){

        Map<String,Object> map = new HashMap<>();
        boolean res=sysuserService.checkName(name);
        //如果名称存在，可用--->返回valid=true,不做校验，否则不可用----->valid=false,message='提示消息',校验器会根据valid值为false,输出meaasge的值
        if(res){
            map.put("valid",true);
        }
        else{
            map.put("valid",false);
            map.put("message","账号("+name+")已经存在");
        }
        return map;

    }


    //修改用户名字
    @RequestMapping("/modifyName")
    @ResponseBody
    public ResponseResult modifyName(Integer id,String name){
        try {
            sysuserService.modifyName(id,name);
            return ResponseResult.success("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.fail("更新失败");
        }

    }

    //修改用户状态
    @RequestMapping("/modifyStatus")
    @ResponseBody
    public ResponseResult modifyStatus(int id){
        try {
            sysuserService.modifyStatus(id);
            return ResponseResult.success("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.fail("更新失败");
        }

    }

}
