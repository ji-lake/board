package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	
	// 게시물 목록
	public List<BoardVO> list() throws Exception;
	
	// 작성
	public void write(BoardVO vo) throws Exception;
	
	// 조회
	public BoardVO view(int bno) throws Exception;
	
	// 수정
	public void modify(BoardVO vo) throws Exception;
	
	// 삭제
	public void delete(int bno) throws Exception;
	
}
