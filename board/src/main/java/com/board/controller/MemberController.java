package com.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.MemberVO;
import com.board.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	MemberService MService;
	
	// 회원가입 get
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void getJoin() throws Exception {
		logger.info("__________회원가입을 합니다_______________");
		
	}
	
	// 회원가입 post
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String postJoin(MemberVO vo) throws Exception {
		logger.info("________________회원가입 성공________________");
		
		MService.join(vo);
		
		return "redirect:/";
	}

}
