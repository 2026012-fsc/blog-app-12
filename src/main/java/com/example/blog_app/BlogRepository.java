package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepository {
    private final JdbcClient jdbcClient;

    public BlogRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    public List<Blog> findAll(){
        return jdbcClient.sql("SELECT id, title, maintext FROM blog")
            .query(Blog.class)
            .list();
    }

    public Optional<Blog> findById(Long id){
        return jdbcClient.sql("SELECT title, maintext FROM blog WHERE id = :id")
            .param("id", id)
            .query(Blog.class)
            .optional();
    }

    public void save(BlogForm blogForm){
        jdbcClient.sql("INSERT INTO blog (id, title, maintext) VALUES (null, :title, :maintext)")
            .param("title", blogForm.getTitle())
            .param("maintext", blogForm.getMaintext())
            .update();
    }
}
