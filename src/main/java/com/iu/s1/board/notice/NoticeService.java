package com.iu.s1.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.board.BoardService;
import com.iu.s1.board.BoardVO;
@Service
public class NoticeService implements BoardService{
	@Autowired
	private NoticeMapper mapper;
	@Override
	public List<BoardVO> getList() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getList();
	}
	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getSelect(boardVO);
	}
	@Override
	public Long getInsert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long getUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long getDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
