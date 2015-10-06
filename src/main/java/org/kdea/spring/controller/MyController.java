package org.kdea.spring.controller;

import javax.servlet.http.HttpServletRequest;
import org.kdea.spring.service.MyService;
import org.kdea.spring.service.command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyService myservice;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginget(HttpServletRequest Request, Model model) {
    	
        return "loginform";    
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public command loginpost(@RequestParam("id") String id,@RequestParam("pw") String pw,HttpServletRequest Request, Model model) {
    	boolean check=false;
    	command com = new command();
    	com.setId(Integer.parseInt(id));
    	com.setPw(pw);
    	
    	check = myservice.logincheck(com);
    	com.setCheck(check);
    	model.addAttribute("command", com);
        model.addAttribute("check", check);
        
     Request.getSession().setAttribute("logining", check);
     
        return com;    
    }


    public MyService getMyservice() {
	return myservice;
    }

    public void setMyservice(MyService myservice) {
	this.myservice = myservice;
    }
}