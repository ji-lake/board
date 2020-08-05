package com.board.persistence;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
	
	// 게시물 목록
	public List<BoardVO> list() throws Exception;
	
	// 작성
	public void write(BoardVO vo) throws Exception;
	
	// 조회
	public BoardVO view(int bno) throws Exception;
	
	// 수정
	public void update(BoardVO vo) throws Exception;
	
	// 삭제
	public void delete(int bno) throws Exception;

}
