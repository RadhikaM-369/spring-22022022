package com.xworkz.book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestBookInfo {
	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
		dataSource.setUsername("root");
		dataSource.setPassword("SQL123456789");
		JdbcTemplate jdbcTemp = new JdbcTemplate(dataSource);
		/*
		  String insertQry="Insert into book_info (book_name ,author,price,edition) values (?,?,?,?)"; 
		 int result=jdbcTemp.update(insertQry,"The Secret","Rhonda Byrne",492,"1st");
		 int result1=jdbcTemp.update(insertQry,"The Power Of NOW","Eckhart Tolle",800,"2nd"); 
		 int result2=jdbcTemp.update(insertQry, "The Alchemy","Paulo Coelho",800,"25th");
		 int result3=jdbcTemp.update(insertQry, "The Magic","Rhonda Byrne",400,"first"); 
		 int result4=jdbcTemp.update(insertQry, "The power of subconcious mind","Dr.Joseph Merphy",1200,"first");
		 if(result1>0) {
		  System.out.println("------Inserting a new book details------"); }
		  String updateQry="Update book_info SET book_name=? where id=?"; 
		  int result=jdbcTemp.update(updateQry, "The Magic",2); 
		  if(result>0) {
		  System.out.println("------Updating a new book details------"); }
		  String deleteQry="delete from book_info where id=?";
		  int result=jdbcTemp.update(deleteQry, 2);
		  if(result>0) {
		  System.out.println("------deleted book details------"); }
		 */
		String read = "SELECT * from book_info";
		RowMapper<Book> rowMapper = new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet result, int row) throws SQLException {
				int Id = result.getInt("id");
				String name = result.getString("book_name");
				String bookAuthor = result.getString("author");
				int bookPrice = result.getInt("price");
				String bookEdition = result.getString("edition");
				return new Book(Id, name, bookAuthor, bookPrice, bookEdition);
			}
		};

		List<Book> listBooks = jdbcTemp.query(read, rowMapper);
		for (Book book : listBooks) {
			System.out.println(book.toString());
		}
	}
}
