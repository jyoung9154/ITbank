package com.project.proto.dao;

import java.util.List;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class Dao {

	@Autowired
	private SqlSession sqlSession;
	
	/*��ü ��� ��*/ 
	public List<Dao> selectMember() {
		return sqlSession.selectList("selectList");
	}
	
	
}
