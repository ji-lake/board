package com.board.service;

import com.board.domain.MemberVO;

public interface MemberService {
	
	// 회원 가입
	public void join(MemberVO vo) throws Exception;

}
