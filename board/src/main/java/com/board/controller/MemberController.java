package com.board.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		logger.info("__________로그인 go__________");
		
		HttpSession session = req.getSession();
		
		MemberVO login = MService.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		} else {
			session.setAttribute("member", login);
			logger.info("아이디 : " + vo.getUserId());
			logger.info("비밀번호 : " + vo.getUserPass());
			logger.info("이름 : " + vo.getUserName());
			logger.info("아이디22222 : " + login.getUserId());
			logger.info("비밀번호222222 : " + login.getUserPass());
			logger.info("이름2222222 : " + login.getUserName());
		}
		
		return "redirect:/";
	}
	
	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		logger.info("______________로그아웃_______________");
		
		session.invalidate();
		
		return "redirect:/";
	}

}
