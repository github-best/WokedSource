package com.test.fm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class FreeMakerTest {
	 private FreemarkerUtil f= new FreemarkerUtil();
	 Map<String, Object> map = new HashMap<String, Object>();
	 
	//把数据输出到控制台
	 
	//这种情况，前端页面根据key值，取value
	@Test
	public void test01(){
		 User user = new User();
	     user.setName("百合花！！！");
	     map.put("username", user.getName());
	     f.print("01.ftl", map);
	     f.fprint("01.ftl", map, "hello01.txt");
	     System.out.println();
	     System.out.println("=========================================");
		
		
	}
	//这种情况，前端页面根据key值，取value
	@Test
	public void test02(){
		 User user = new User();
	     user.setName("北冰洋！！！");
	     user.setAge(18);
	     map.put("username", user.getName());
	     map.put("age", user.getAge());
	     f.fprint("02.ftl", map, "hello02.txt");
	     f.print("02.ftl", map);
	     System.out.println();
	     System.out.println("=========================================");
		
		
	}
	
	//这种情况，前端页面根据key值，取value
	@Test
	public void test03(){
		 User user = new User();
	     user.setId(102);
	     user.setAge(12);
	     user.setName("店小二");
	     map.put("user", user);
	     f.print("03.ftl", map);
	     f.fprint("03.ftl", map, "hello03.txt");
	     System.out.println();
	     System.out.println("=========================================");
		
	}
	//这种情况，前端页面根据key值，取value
	@Test
	public void test04(){
		 User user = new User();
	     user.setId(8);
	     user.setAge(12);
	     user.setName("我是南极的企鹅！！！");
	     List<User> users = new ArrayList<User>();
	     users.add(user);
	     map.put("users", users);
	     f.print("04.ftl", map);
	     f.fprint("04.ftl", map, "hello04.txt");
		System.out.println();
		System.out.println("=========================================");
		
	}
	//这种情况，前端页面根据key值，取value
	@Test
	public void test05(){
		 User user = new User();
	     user.setId(8);
	     user.setAge(12);
	     user.setName("大家好我是达摩院出来的僧人!！！");
	     List<User> users = new ArrayList<User>();
	     users.add(user);
	     map.put("users", users);
	     f.print("05.ftl", map);
	     f.fprint("05.ftl", map, "hello05.txt");
		System.out.println();
		System.out.println("=========================================");
		
	}
	//这种情况，前端页面根据key值，取value
	@Test
	public void test06(){
		 
        Group group = new Group();
        group.setName("IT");
         
        User user = new User();
        user.setId(001);
        user.setName("张三");
        user.setAge(12);
        user.setGroup(group);
         
        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user);
        users.add(user);
         
        map.put("user", user);
        //普通EL赋值
        //util.print("01.ftl", map );
        //判断
        //util.print("03.ftl", map, "03.html");
        //遍历
        //util.print("05.ftl", map);
        //子元素判断
        f.print("06.ftl", map);
        f.fprint("06.ftl", map, "hello06.txt");
        
	}

}


