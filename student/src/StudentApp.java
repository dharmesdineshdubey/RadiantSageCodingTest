import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.LinkedList;

import Dao.studentDao;
import Entity.student;


public class StudentApp {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("================== WELCOME ====================");
				System.out.println("i. Insert");
				System.out.println("u. Update");
				System.out.println("d. Delete");
				System.out.println("s. Search");
				System.out.println("e. Exit");
				String ch = br.readLine();
				if("i".equalsIgnoreCase(ch)){
					student s1 = new student();
					System.out.println("Enter the id to be inserted: ");
					s1.setStudentId(Integer.parseInt(br.readLine()));
					System.out.println("Enter student Name: ");
					s1.setStudentName((br.readLine()));
					System.out.println("Enter student age: ");
					s1.setstudentAge((Integer.parseInt(br.readLine())));
					studentDao.insert(s1);
					System.out.println("Student Inserted");
				}
				else if("u".equalsIgnoreCase(ch)){
					student s2 = new student();
					System.out.println("Enter the id to be updated: ");
					s2.setStudentId(Integer.parseInt((br.readLine())));
					System.out.println("Enter student name: ");
					s2.setStudentName((br.readLine()));
					System.out.println("Enter student age: ");
					s2.setstudentAge((Integer.parseInt(br.readLine())));
					studentDao.update(s2);
					System.out.println("Data updated");
				}
				else if("d".equalsIgnoreCase(ch)){
					student s3 = new student();
					System.out.println("Enter the id to be deleted - ");
					s3.setStudentId(Integer.parseInt((br.readLine())));
					studentDao.delete(s3);
					System.out.println("Data deleted");
				}
				else if("s".equalsIgnoreCase(ch)){
					System.out.println("Enter the age to be searched - ");
					String age = br.readLine();
					LinkedList<student> res = studentDao.search(age);
					if(res.size()==0){
						System.out.println("No Rows Found");
					}
					for (student stu : res) {
						System.out.println("=====================================");
						System.out.println("Id : " + stu.getStudentId());
						System.out.println("student Name : " + stu.getStudentName());
						System.out.println("Age : " + stu.getstudentAge());
					}
				}
				else if("e".equalsIgnoreCase(ch)){
					break;
				}
				else{
					System.out.println("Invalid Option !!!!!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
		
		

}
