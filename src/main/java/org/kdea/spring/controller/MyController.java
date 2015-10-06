package org.kdea.spring.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import org.kdea.spring.service.MyService;
import org.kdea.spring.service.command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    private MyService myservice;

  /*  @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(Locale locale, Model model) {
        model.addAttribute("sampleData", myservice.getMsg() );
        return "hello";
    }

  
    @RequestMapping(value = "/guguall", method = RequestMethod.GET)
    public String gugu(Locale locale, Model model) {
        model.addAttribute("gugudan", myservice.gugudanmake() );

        return "gugu";    
    }*/
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginget(HttpServletRequest Request, Model model) {

        return "loginform";    
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginpost(@RequestParam("id") String id,@RequestParam("pw") String pw, Model model) {
    	System.out.println("1");//--------------------------------------------------------------------------------------
    	command com = new command();
    	com.setId(Integer.parseInt(id));
    	com.setPw(pw);
    	
    	System.out.println("2"+com.getId());//--------------------------------------------------------------------------------------
    	
    	model.addAttribute("command", com);
        model.addAttribute("check", myservice.logincheck(com));
        
        System.out.println("3");//--------------------------------------------------------------------------------------
        return "loginResult";    
    }
    
/*    @RequestMapping(value = "/gugunum", method = RequestMethod.GET)
    public String gugudannum(HttpServletRequest Request, Model model) {
    	
    	String num = Request.getParameter("num");
        model.addAttribute("gugudan", myservice.gugudanone(num));
        return "gugu";    
    }
    
    @RequestMapping(value = "/guguparam", method = RequestMethod.GET)
    public String gugudanparam(@RequestParam("num") int num, Model model) {
    	
        model.addAttribute("gugudan", myservice.gugudanoneparam(num));
        return "gugu";    
    }
    */

    public MyService getMyservice() {
	return myservice;
    }

    public void setMyservice(MyService myservice) {
	this.myservice = myservice;
    }
}