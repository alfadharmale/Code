package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.daoi.Daoi;

import com.cjc.model.User;
import com.cjc.servicei.servicei;

@Service
public class serviceImpl implements servicei {
	
	@Autowired
	Daoi di;

	@Override
	public void register(User e) {
		
		di.save(e);
		
		
	}

	@Override
	public void delete(int project_id) {
		di.deleteById(project_id);
		
	}

	@Override
	public List<User> findall() {
		List<User> el = (List<User>) di.findAll();
		return el;
		
	}

	/*@Override
	public void update(int empid) {
		
		
		
		
	}
*/
}
