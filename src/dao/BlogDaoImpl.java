package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Blog;
import utility.ConnectionManager;

public class BlogDaoImpl{
	public void insertBlog(Blog blog) throws Exception {
	//	System.out.print("entered bloaimp");
		Connection con=ConnectionManager.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into BLOG(ID,BLOG_TITLE,BLOG_DESCRIPTION,DATE_POSTED)values(?,?,?,?)");
		ps.setInt(1,blog.getBlogId());
		ps.setString(2,blog.getBlogTitle());
		ps.setString(3,blog.getBlogDescription());
		ps.setDate(4, java.sql.Date.valueOf(blog.getPostedOn()));
		ps.executeQuery();
		con.close();
		
				
		
	}
	
	public List<Blog> selectAllBlogs() throws SQLException, Exception {
		Statement s=ConnectionManager.getConnection().createStatement(); 
		ResultSet r=s.executeQuery("select * from BLOG" );
		
		List<Blog> l=new ArrayList<Blog>();
		while(r.next())
		{
			int id=r.getInt("ID");
			String blog_title=r.getString("TITLE");
			String blog_des=r.getString("DESCRIPTION");
			Date d=r.getDate("DATE");
			
			Blog b=new Blog();
			b.setBlogId(id);
			b.setBlogTitle(blog_title);
			b.setBlogDescription(blog_des);
		//	b.setPostedOn(d);
			
			
			l.add(b);
			ConnectionManager.getConnection().close();
			
			
			
		}
		
		return l;
	}
	

	
}