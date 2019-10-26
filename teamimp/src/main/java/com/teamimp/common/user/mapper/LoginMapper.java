package com.teamimp.common.user.mapper;

import com.teamimp.common.user.vo.LoginVO;
import com.teamimp.common.user.vo.UserVO;

public interface LoginMapper {

	public UserVO selectOneUserForLogin(LoginVO inVO) throws Exception;
	
	public int insertLoginHistory(LoginVO inVO) throws Exception;
	
}
