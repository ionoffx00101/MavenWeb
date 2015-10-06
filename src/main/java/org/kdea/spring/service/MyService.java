package org.kdea.spring.service;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myservice")
public class MyService {
	 
	public String getMsg() {
		
		return "Hello World";
	}

	public String gugudanmake() {
		String str="";
		
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				str +=""+i+" * "+j+" = "+(i*j)+"<br>";
			}
		}
		
		return str;
	}
	public String gugudanone(String num) {
		String str="";
		int nums = Integer.parseInt(num);
		for(int i=1;i<10;i++){
				str +=""+nums+" * "+i+" = "+(nums*i)+"<br>";

		}
		
		return str;
	}
	public String gugudanoneparam(int num) {
		String str="";

		for(int i=1;i<10;i++){
				str +=""+num+" * "+i+" = "+(num*i)+"<br>";

		}
		
		return str;
	}

	public String loginform() {

		
		return "loginform";
	}

	public boolean logincheck(command com) {
		
		EmpDAO dao = new EmpDAO();
		boolean check = dao.checkEmp(com.getId(),com.getPw());
		
		return check;
	}

}