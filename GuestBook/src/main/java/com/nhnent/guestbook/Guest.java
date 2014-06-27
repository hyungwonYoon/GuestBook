package com.nhnent.guestbook;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Guest {
	
	private int idx;					// ���� �� ID
	private String writer;			// �ۼ���
	private String title;			// ����
	private String contents;		// ����
	private String email;			// �̸���
	private String pwd;				// ��й�ȣ
	private Date regdate;			// ����Ͻ�
	private Date moddate;			// �����Ͻ� 
	
	public static final String ENTER = System.getProperty("line.separator");
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String gteContents() {
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
	
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
