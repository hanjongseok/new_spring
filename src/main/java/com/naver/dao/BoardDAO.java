package com.naver.dao;

import java.util.List;

import com.naver.vo.BoardVO;
import com.naver.vo.Criteria;
import com.naver.vo.SearchCriteria;
import java.beans.*;
public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
//게시판 뷰
	public List<BoardVO> list(SearchCriteria scri) throws Exception;
	
	
	public int listCount(SearchCriteria scri) throws Exception;
	
//게시판 글 보기
	public BoardVO read(int bno) throws Exception;

	// 게시물 수정
	public void update(BoardVO boardVO) throws Exception;

	// 게시물 삭제
	public void delete(int bno) throws Exception;

}