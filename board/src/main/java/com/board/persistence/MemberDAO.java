package com.board.persistence;

import com.board.domain.MemberVO;

public interface MemberDAO {
	
	// 회원 가입
	public void join(MemberVO vo) throws Exception;

}
