package org.kdea.spring.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.kdea.spring.service.EmpService;
import org.kdea.spring.service.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


	@Controller
	public class EmpController {

	    @Autowired
	    private EmpService empservice;

	    @RequestMapping(value = "/lnkemplist", method = RequestMethod.GET)
	    public String loginget(HttpServletRequest Request, Model model) {
	    	
	    	if((boolean) Request.getSession().getAttribute("logining")){
	    		List<EmpVO> list =empservice.getlistsvc();
	    		
	    		Request.setAttribute("list", list);
	    		return "emplist";
	    		
	    	};
	    	
	        return "loginform";    
	    }

		public EmpService getEmpservice() {
			return empservice;
		}

		public void setEmpservice(EmpService empservice) {
			this.empservice = empservice;
		}
	
}
