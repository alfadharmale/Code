package com.cjc.servicei;

import java.util.List;


import com.cjc.model.User;

public interface servicei {
	public void register(User e);
	
	/*public void update(int empid);*/
	
	public void delete(int project_id);
	
	public List<User> findall();

}
