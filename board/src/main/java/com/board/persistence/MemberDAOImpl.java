package com.board.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.board.domain.MemberVO;

@Service
public class MemberDAOImpl implements MemberDAO {

	// 마이바티스
	@Inject
	private SqlSession sql;
	
	// 매퍼
	private static String namespace = "com.board.mappers.memberMapper";
	
	@Override
	public void join(MemberVO vo) throws Exception {
		sql.insert(namespace + ".join", vo);
		
	}

}
