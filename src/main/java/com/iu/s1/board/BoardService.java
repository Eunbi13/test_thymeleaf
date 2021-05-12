package com.iu.s1.board;

import java.util.List;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

public interface BoardService {
	public List<BoardVO> getList(Pager pager) throws Exception;
	public BoardVO getSelect(BoardVO boardVO) throws Exception;
	public Long setInsert(BoardVO boardVO) throws Exception;
	public Long setUpdate(BoardVO boardVO) throws Exception;
	public Long setDelete(BoardVO boardVO) throws Exception;
}
