package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
		@Inject
		BoardService service;
		
		// 게시물 목록
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public void getList(Model model) throws Exception {
			
			List<BoardVO> list = null; list = service.list();
			model.addAttribute("list",list);
		}
		// 글 작성 get
		@RequestMapping(value = "/write", method = RequestMethod.GET)
		public void getWrite() throws Exception {
			logger.info("________________글을 작성할겁니다________________");
		}
		
		// 글 작성 post
		@RequestMapping(value = "/write", method = RequestMethod.POST)
		public String postWrite(BoardVO vo) throws Exception {
			logger.info("________________글 작성이 완료되었습니다________________");
			
			service.write(vo);
			
			return "redirect:/";
		}
		
		
}
