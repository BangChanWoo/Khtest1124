package com.mycompany.myapp09.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp09.member.model.service.MemberService;


@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/idCheck", method=RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam("id") String id){
		System.out.println(id);
		String result=null;
		int result1=0;
		try {
			System.out.println(result1);
			result1 = memberService.idCheck(id);
			System.out.println(result1);
			
			if(result1==1) {
				result = "false";
				
			}else if (result1==0){
				result = "true";
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
