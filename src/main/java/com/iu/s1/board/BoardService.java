package com.iu.s1.board;

import java.util.List;
import org.springframework.stereotype.Service;

public interface BoardService {
	public List<BoardVO> getList() throws Exception;
	public BoardVO getSelect(BoardVO boardVO) throws Exception;
	public Long getInsert(BoardVO boardVO) throws Exception;
	public Long getUpdate(BoardVO boardVO) throws Exception;
	public Long getDelete(BoardVO boardVO) throws Exception;
}
