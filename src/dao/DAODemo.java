package dao;

import java.util.List;
/*
 * Data Access Object Pattern or DAO pattern is used to separate low level data accessing API 
 * or operations from high level business services. Following are the participants in 
 * Data Access Object Pattern.

Data Access Object Interface - This interface defines the standard operations to be performed 
on a model object(s).

Data Access Object concrete class - This class implements above interface. 
This class is responsible to get data from a data source which can be database / xml or 
any other storage mechanism.

Model Object or Value Object - This object is simple POJO containing get/set methods 
to store data retrieved using DAO class.
 */
public class DAODemo {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAOImpl();
		List<Student> students = studentDAO.getAllStudents();

		for (Student student : students) {
			System.out.println("RollNo " + student.getRollNo() + " Name " + student.getName());
		}

		studentDAO.updateStudent(studentDAO.getAllStudents().get(0));
		studentDAO.deleteStudent(studentDAO.getAllStudents().get(0));
		Student studentData = studentDAO.getStudent(0);

	}

}
