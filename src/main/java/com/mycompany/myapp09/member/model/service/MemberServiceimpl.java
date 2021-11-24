package com.mycompany.myapp09.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.member.model.dao.MemberDao;
import com.mycompany.myapp09.member.model.vo.Member;

@Service("memberService")
public class MemberServiceimpl implements MemberService{
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int idCheck(String id) {
		int result=0;
		
		try {
			result = memberDao.idCheck(id);
			System.out.println("mapper에서 select 문을 수행하고 가져온 값"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
