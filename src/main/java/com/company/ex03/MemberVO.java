package com.company.ex03;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter

public class MemberVO {
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	public MemberVO()
	{
		System.out.println("MemberVO 생성자 호출");
	}

}
