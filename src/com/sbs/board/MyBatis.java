package com.sbs.board;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sbs.board.article.dao.Article;
import com.sbs.board.mapper.ArticleMapper;


public class MyBatis {
	String resource = "com/sbs/config/mybatis-config.xml";
	private SqlSessionFactory sqlSessionFactory;
	
	public MyBatis() {
		InputStream inputStream = null;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	
	public List<Article>  getAllArticles() {
		SqlSession session = sqlSessionFactory.openSession();
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		List<Article> articles = mapper.getAllArticles();
		session.close();
		
		return articles;
	}

	public Article getArticleById(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		
		Article article = mapper.getArticleById(id);
		
		System.out.println(article.getTitle());
		System.out.println(article.getBody());
		
		return article;
	}
	
	public void insertArticle(String title, String body) {
		SqlSession session = sqlSessionFactory.openSession(true);
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		
		//1. map
//		Map<String, Object> paramMap = new HashMap<>();
//		paramMap.put("title", title);
//		paramMap.put("body", body);
//		mapper.insertArticle(paramMap);

		//2. dto
		
		Article article = new Article();
		article.setTitle(title);
		article.setBody(body);
		mapper.insertArticle2(article);
	}
}