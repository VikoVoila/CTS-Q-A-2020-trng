package com.cts.voila;



import java.util.*;
import com.cts.voila.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {
	/*
	 * Map<Integer, Product> li = new HashMap<Integer, Product>();
	 */
	/*
	 * List<Product> l=new ArrayList<Product>();
	 */
	
	HashMap<Integer, Product> hm = new HashMap<Integer, Product>(); // for multiple object
	
	@RequestMapping("/json")
	public  HashMap<Integer, Product> TestControl() {
		
		/* Product p = new Product(123,"Tv",12,874.4f); */
		hm.put(101, new Product(1213, "TV",26382,7648.0f));
		hm.put(102, new Product(123,"AC",12,874.4f));
		
		hm.put(103, new Product(123,"Toy",52,900.2f));
		/*
		 * Product p1 = new Product(124,"AC",52,954.1f);
		 */
		return hm;
	}
	
	@RequestMapping(value="/getbyid/{pid}",method = RequestMethod.GET)
	public Product getById(@PathVariable("pid") int id) {
		
		return hm.get(id);
		
	}
	
	@RequestMapping("/data")
	public String display() {
		
		return "Hello!";
	}
	
	@RequestMapping("/jsonData")
	public String display1() {
		
		return "Hi..!";
	}


}
