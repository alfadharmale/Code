package com.cjc.Controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.cjc.Model.User;
import com.fasterxml.jackson.core.JsonProcessingException;

@CrossOrigin(origins="*")
@RestController
public class HomeController {
	
	@Autowired
	RestTemplate rt;
	
	
	
	
	@RequestMapping(value="saveEmployee", method=RequestMethod.POST,consumes="application/json")

	public 	@ResponseBody User savedata(@RequestBody User e) {
		
		String url = "http://localhost:8086/save";
		User em = rt.postForObject(url, e, User.class);
		return em;		
	}
	
	
	@RequestMapping(value="Employee", method=RequestMethod.PUT)
	public void update(@RequestBody User e) {
		String url = "http://localhost:8086/updateData";
		rt.put(url, e,User.class);
		
	}
	
	
	/*@RequestMapping(value="deleteEmployee", method=RequestMethod.DELETE, produces="application/json")
	public List delete(@RequestParam  int empid) {
		
		String url = "http://localhost:8086/delete?empid="+empid;
		
		List<Employee> el = rt.getForObject(url, List.class);
		System.out.println(el);
		return el;
		
		
	}*/
	
	@RequestMapping(value="deleteEmployee/{project_id}", method=RequestMethod.DELETE, produces="application/json")
	public List delete(@PathVariable (name="project_id") int empid) {
		
		
		String url = "http://localhost:8086/delete/"+empid+"";
		List<User> el = rt.getForObject(url, List.class);
		System.out.println(el);
		return el;
		
	}
	
	@RequestMapping(value="/find", method=RequestMethod.GET, produces="application/json")
	public List getAllUser(HttpServletResponse response)
	{
		
		
		String url = "http://localhost:8086/findall";
	//	String url = "https://www.youtube.com/findall";
		List<User> el = rt.getForObject(url, List.class);
		if(el!=null) {
			response.setStatus(HttpServletResponse.SC_FOUND);
			return el;
		}
		else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
		return null;
		
		
		 
	}
	

}
