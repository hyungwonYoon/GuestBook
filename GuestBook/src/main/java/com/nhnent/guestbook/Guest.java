package com.nhnent.guestbook;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Guest {
	
	private int idx;					// 방명록 글 ID
	private String name;			// 작성자
	private String contents;		// 내용
	private String email;			// 이메일
	private String pwd;				// 비밀번호
	private Date regdate;			// 등록일시
	private Date moddate;			// 수정일시 
	
	public static final String ENTER = System.getProperty("line.separator");
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getContents() {
		if (contents != null) {
			return contents.replaceAll(ENTER, "<br />");
		} 
		return null;  
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public Date getModdate() {
		return regdate;
	}
	
	public void setModdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public String getRegFormatDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(regdate);
	}
	public String getRegDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(regdate);
	}
	
	public String getModFormatDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(moddate);
	}
	public String getModDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(moddate);
	}
	
}
