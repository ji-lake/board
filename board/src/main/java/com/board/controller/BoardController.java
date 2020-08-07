package com.board.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
		@Inject
		BoardService BService;
		
		// 게시물 목록
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public void getList(Model model) throws Exception {
			
			List<BoardVO> list = null; 
			list = BService.list();
			model.addAttribute("list",list);
		}
		// 글 작성 get
		@RequestMapping(value = "/write", method = RequestMethod.GET)
		public void getWrite(HttpSession session, Model model) throws Exception {
			logger.info("________________글을 작성할겁니다________________");
			
			Object loginInfo = session.getAttribute("member");
			
			if(loginInfo == null) {
				model.addAttribute("msg",false);
			}
		}
		
		// 글 작성 post
		@RequestMapping(value = "/write", method = RequestMethod.POST)
		public String postWrite(BoardVO vo) throws Exception {
			logger.info("________________글 작성이 완료되었습니다________________");
			
			BService.write(vo);
			
			return "redirect:/";
		}
		
		// 게시물 조회
		@RequestMapping(value = "/view", method = RequestMethod.GET)
		public void getView(@RequestParam("bno") int bno, Model model) throws Exception {
			
			BoardVO vo = BService.view(bno);
			
			model.addAttribute("view", vo);
		}
		
		// 게시물 수정
		@RequestMapping(value = "/modify", method = RequestMethod.GET)
		public void getModify(@RequestParam("bno") int bno, Model model) throws Exception {
			logger.info("______________수정 할겁니다_____________");
			
			BoardVO vo = BService.view(bno);
			
			model.addAttribute("view", vo);

		}
		
		// 게시물 수정
		@RequestMapping(value = "/modify", method = RequestMethod.POST)
		public String postModify(BoardVO vo) throws Exception {			
			logger.info("______________수정 완료_____________");
			
			BService.modify(vo);
			
			return "redirect:/board/view?bno=" + vo.getBno();
			
		}
		
		// 게시물 삭제
		@RequestMapping(value = "/delete", method = RequestMethod.GET)
		public String getDelete(@RequestParam("bno") int bno) throws Exception {
		  
			BService.delete(bno);  

			return "redirect:/board/list";
		 
		}
		
		
}
