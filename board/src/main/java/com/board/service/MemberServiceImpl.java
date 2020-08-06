package com.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.MemberVO;
import com.board.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
		
		@Override
		public void join(MemberVO vo) throws Exception {

			dao.join(vo);
		
		
	}

}
