package com.nhnent.guestbook;

import java.util.ArrayList;

public interface BoardMapper {
	// ����Ʈ ���
	public ArrayList<Guest> getList();
	// �� �� ���
	public int insert(Guest item);	
	// �� ���� 
	public void update(Guest item);	
	// �ۻ��� 
	public void delete(int idx);
}
