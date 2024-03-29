package com.teamimp.common.user.mapper;

import java.util.List;

import com.teamimp.common.user.vo.UserVO;

public interface UserListMapper {
	
	 public String getNow() throws Exception;
	 
	 public UserVO selectOneUser(int userId) throws Exception;

	 public UserVO insertUser(UserVO inVO) throws Exception;

	 public UserVO removeUser(int userId) throws Exception;

	 public UserVO updateUser(UserVO inVO) throws Exception;

	 public List<UserVO> selectUserList(UserVO inVO) throws Exception;
	 
	 public UserVO selectUserListCount(UserVO inVO) throws Exception;
	 
}
