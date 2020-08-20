package dao;

import java.util.List;

import model.Blog;

public interface BlogDaoInterface{
	void insertBlog(Blog blog); // - method to insert the blog into the database.
	@SuppressWarnings("rawtypes")
	List selectAllBlogs(); // - method to retrieve the blogs from the database.

}

