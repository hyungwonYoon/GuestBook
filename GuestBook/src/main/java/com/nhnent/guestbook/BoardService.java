package com.nhnent.guestbook;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.nhnent.guestbook.Guest;

public interface BoardService {
	// ���� ����Ʈ 
	public List<Guest> getList();
	// �� �߰� 
	@Transactional
	public Guest insert(Guest item);
	// �� ���� 
	@Transactional
	public void update(Guest item);
	// �� ���� 
	@Transactional
	public void delete(int idx);
	// ��й�ȣ Ȯ��
	public int checkPwd(Map<String, Object> param);
	
	public List<Guest> select(Map<String, Object> param);
	
	
}
