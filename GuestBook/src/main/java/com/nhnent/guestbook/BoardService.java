package com.nhnent.guestbook;
import java.util.ArrayList;
import java.util.HashMap;
import com.nhnent.guestbook.Guest;

public interface BoardService {
	// ���� ����Ʈ 
	public ArrayList<Guest> getList();
	// �� �߰� 
	public void insert(Guest item);
	// �� ���� 
	public void update(Guest item);
	// �� ���� 
	public void delete(int idx);
	
	
	
	
}
