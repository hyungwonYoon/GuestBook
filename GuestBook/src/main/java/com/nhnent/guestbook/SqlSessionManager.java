package com.nhnent.guestbook;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * iBatis�� SqlMapClient Ŭ����, Mybatis�� SqlSessionFactory Ŭ����
 * query�� �����ϱ� ���ؼ��� SqlSessionFactory�� ���ؼ� SqlSession ��ü�� �����Ͽ� query�� ������ �� �ִ�.
 */
public class SqlSessionManager {
  public static SqlSessionFactory sqlSession;

  static {
    String resource = "Configuration.xml";
    //resource = "/src/Configuration.xml";
    Reader reader;

    try {
      reader = Resources.getResourceAsReader(resource);
      sqlSession = new SqlSessionFactoryBuilder().build(reader);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static SqlSessionFactory getSqlSession() {
    return sqlSession;
  }
}