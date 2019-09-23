package com.cjc.Controller;


import java.net.Authenticator.RequestorType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;
import com.cjc.servicei.servicei;

@CrossOrigin(origins="*")
@RestController
public class HomeController {
	
	@Autowired
	servicei si;
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public void register(@RequestBody User e) {
		
		si.register(e);;
	}
	
	
	@RequestMapping(value="updateData", method=RequestMethod.PUT)
	public void update(@RequestBody User e) {
		si.register(e);
		
	}
	
	//-------------------------delete------------------------------------------------------------------
	/*@RequestMapping(value="delete")
	public List<Employee> delete(@RequestParam int empid) {
		
	 si.delete(empid);
	 
	List<Employee> el =  si.findall();
	System.out.println(el);
	return el;
	 
	}*/
	
	@RequestMapping(value="delete/{project_id}")
	public List<User> delete(@PathVariable(name="project_id") int project_id) {
		
	 si.delete(project_id);
	 
	List<User> el =  si.findall();
	System.out.println(el);
	return el;
	 
	}
	//----------------------------------------------------delete-----------------------------------
		
	@RequestMapping(value="/findall")
	public List<User> getData(){
		
		List<User> el = si.findall();
		System.out.println("list is");
		System.out.println(el);
		return el;
		
	}
}
