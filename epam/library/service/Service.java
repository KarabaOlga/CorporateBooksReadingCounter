package com.epam.library.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.epam.library.dao.ConnectionDaoImpl;

public class Service implements IService{

	@Override
	public void moreThanOneBook() {
		
		String query="select employee.name, count(*) from  employee_book join employee on employee_book.employee_id=employee.id join book on employee_book.book_id=book.id group by employee.name  having count(*)>1";
		ConnectionDaoImpl dao =new ConnectionDaoImpl();
		//String query="select ID from java_task.employee_book";
		try {
			ResultSet result=dao.dbconnection(query);
			while(result.next())
				System.out.println(result.getString("NAME")+result.getString("COUNT") );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void leastTwoBooks() {
		String query="select employee.name, employee.date_of_birth, count(*)from employee_book join employee on employee_book.employee_id=employee.id join book on employee_book.book_id=book.id group by employee.name  having count(*)>2"; 
        ConnectionDaoImpl dao =new ConnectionDaoImpl();
		try {
			ResultSet result=dao.dbconnection(query);
			while(result.next())
				System.out.println(result.getString("NAME")+result.getDate("DATE_OF_BIRTH")+result.getString("COUNT") );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void renameBook() { 
			String query="UPDATE book SET title ='РРР' where title='Фантастика'";
			ConnectionDaoImpl dao =new ConnectionDaoImpl();
			try {
				ResultSet result=dao.dbconnection(query);	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}


}
