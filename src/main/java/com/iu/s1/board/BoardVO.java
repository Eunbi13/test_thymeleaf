package com.iu.s1.board;

import java.sql.Date;

import lombok.Data;
@Data
public class BoardVO {
	private Long num;
	private String title;
	private String writer;
	private String contents;
	private Date regDate;
	private Long hit;
}
