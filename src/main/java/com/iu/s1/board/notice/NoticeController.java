package com.iu.s1.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.s1.board.BoardVO;
import com.iu.s1.util.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@ModelAttribute("board")//속성의 이름
	public String getBoard() {
		return "notice";//벨류값
	}
	
	@GetMapping("list")
	public String getList(Model model, Pager pager) throws Exception{
		List<BoardVO> list = noticeService.getList(pager);
		model.addAttribute("list", list);
		model.addAttribute("pager",pager);
		return"board/list";
	}
	
	@GetMapping("select")
	public String getSelect(Model model, BoardVO boardVO)throws Exception{
		boardVO = noticeService.getSelect(boardVO);
		model.addAttribute("vo", boardVO);
		return "board/select";
	}
	
	@GetMapping("insert")
	public String setInsert()throws Exception{
		return "board/insert";
	}
	
	@PostMapping("insert")
	public String setInsert(BoardVO boardVO)throws Exception{
		noticeService.setInsert(boardVO);
		return "redirect: ./insert";
	}
}
