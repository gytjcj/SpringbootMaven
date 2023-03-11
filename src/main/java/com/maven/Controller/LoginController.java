package com.maven.Controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.maven.model.User;
import com.maven.service.UserService;

@Controller
public class LoginController {

//	登录service注入
	@Autowired
	UserService userService;
//  我的桌面
	@RequestMapping("/desk")
    public String desk(User user, HttpSession session,String verifycode,Model model){
        User user1 =  userService.findUser(user.getPassword(),user.getUsername());
        model.addAttribute("username",user1);
        return "../static/xadmin/welcome";
    }
//////////登录注册satrt
	@RequestMapping("/")
	public String login() {
		return "../static/xadmin/login";
	}
	@RequestMapping("/doLogin")
    public String doLogin(User user, HttpSession session,String verifycode,Model model){
        User user1 =  userService.findUser(user.getPassword(),user.getUsername());
//        String code= (String) session.getAttribute("verifyCode");
//        if(user1!=null&&code.equalsIgnoreCase(verifycode))
        if(user1!=null)
        {
//        	System.out.print(user1);
            model.addAttribute("username",user1);
            return "../static/xadmin/index";
        }
        else
        {
            model.addAttribute("message","失败");
            return "../static/html/enter";
        }
    }
//注册
    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }
    
    
    @RequestMapping("doRegist")
    public String doRegist(User user, Map<String,Object> map){
        userService.insertUser(user);
        map.put("msg","注册成功");
        return "../static/html/login";
    }
//////////登录注册end
	
}