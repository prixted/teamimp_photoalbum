package com.teamimp.common.user.svc;

import javax.servlet.http.HttpSession;

import com.teamimp.common.user.vo.LoginVO;

public interface LoginSvc {
	
	public String doLogin(LoginVO inVO, HttpSession session) throws Exception;
	
	public void doLogout(HttpSession session) throws Exception;
	

}
