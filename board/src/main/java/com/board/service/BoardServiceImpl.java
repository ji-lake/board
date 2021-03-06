package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;
import com.board.persistence.BoardDAO;

@Repository
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	
	// 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);		
	}

	// 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		return dao.view(bno);
	}

	// 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);		
	}

	// 삭제
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);		
	}

}
