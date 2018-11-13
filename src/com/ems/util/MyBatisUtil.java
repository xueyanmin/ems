
package com.ems.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static final ThreadLocal<SqlSession> tl=new ThreadLocal<SqlSession>();
	private static SqlSessionFactory factory;
	//读取 核心配置文件
	static{
		InputStream inputStream=null;
		try{
			//使用Resources读取配置文件,参数为配置文件名称
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//创建SqlSessionFactory对象
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			try{
				if(inputStream!=null) 
					inputStream.close();
			}catch(IOException e){
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	//获取SqlSession
	public static SqlSession openSession(){
		SqlSession sqlSession=tl.get();
		if(sqlSession==null){
			//创建SqlSession对象
			sqlSession =factory.openSession();
			tl.set(sqlSession);
		}
		return sqlSession;
	}
	@SuppressWarnings("unchecked")
	public static Object getMapper(Class clazz){
		SqlSession sqlSession=openSession();
		//根据Mapper文件生成接口的实现类
		return sqlSession.getMapper(clazz);
	}
	//处理事务
	public static void commit(){
		SqlSession session=openSession();
		session.commit();
	}
	public static void rollback(){
		SqlSession session=openSession();
		session.rollback();
	}
	//关流
	public static void close(SqlSession session){
		if(session!=null){
			session.close();
			tl.remove();
		}
	}
}
