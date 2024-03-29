package com.teamimp.common.code.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamimp.common.code.mapper.CodeMapper;
import com.teamimp.common.code.vo.ClassCodeVO;

@Service
public class CodeSvc {

	@Autowired
    CodeMapper codeMapper;

	public List<ClassCodeVO> selectListClassCode(ClassCodeVO inVO) throws Exception {
		return codeMapper.selectListClassCode(inVO);
	}

	public int selectCodeListCount(ClassCodeVO inVO) throws Exception {
		// TODO Auto-generated method stub
		return  codeMapper.selectListClassCodeCount(inVO).getTotal();
	}
	
	public ClassCodeVO selectOneClassCode(ClassCodeVO inVO) throws Exception{
		return codeMapper.selectOneClassCode(inVO);
	}
	
	public void insertClassCode(ClassCodeVO inVO) throws Exception{
		codeMapper.insertClassCode(inVO);
	}

	
}
