package com.iu.s1.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.board.BoardService;
import com.iu.s1.board.BoardVO;
import com.iu.s1.util.Pager;
@Service
public class NoticeService implements BoardService{
	@Autowired
	private NoticeMapper mapper;
	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		pager.makeRow();
		Long totalCount=mapper.getTotalCount(pager);
		pager.makeNum(totalCount);
		return mapper.getList(pager);
	}
	
	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getSelect(boardVO);
	}
	@Override
	public Long setInsert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return mapper.setInsert(boardVO);
	}
	@Override
	public Long setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
