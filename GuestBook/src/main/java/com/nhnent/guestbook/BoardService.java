package com.nhnent.guestbook;

import java.util.List;

import com.nhnent.guestbook.Guest;

public interface BoardService {
	// ���� ����Ʈ 
	public List<Guest> getList();
	// �� �߰� 
	public void insert(Guest item);
	// �� ���� 
	public void update(Guest item);
	// �� ���� 
	public void delete(int idx);
	
	
	
	
}
