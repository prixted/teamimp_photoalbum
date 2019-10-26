package com.teamimp.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.teamimp.common.user.vo.UserVO;

public class TeamimpSessionUtil {
	
	public static UserVO getLoginUser(HttpServletRequest request){
		HttpSession session = request.getSession();
		return (UserVO) session.getAttribute("loginUser");
	}

}
