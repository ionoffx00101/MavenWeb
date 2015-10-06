package org.kdea.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;


@Service("empservice")
public class EmpService {

	public List<EmpVO> getlistsvc() {
		
		EmpDAO dao = new EmpDAO();
	    List<EmpVO> list = dao.AllEmplist();
	    
	    
	    return list;
	}

}
