package com.nhnent.guestbook;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	
	public  List<Guest> getList() {
		return new BoardDAO().getList();
	}
	
	public Guest insert(Guest item) {
		return new BoardDAO().insert(item);
	}

	public Guest update(Guest item) {
		return new BoardDAO().update(item);
		
	}
	
	public void delete(int idx) {
		//boardMapper.delete(idx);
	}
	
	public int checkPwd(Map<String, Object> param)
	{
		return new BoardDAO().checkPwd(param);
	}
	
	public List<Guest> select(Map<String, Object> param)
	{
		return new BoardDAO().select(param);
	}
	
	
	
	
}
