package net.edupoll.kr.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BodymassDAO {

	public int insertData(int cm, int kg, int age,double rate, String result);

	public int deleteData(int cm);
	
	public List info();
	
}
