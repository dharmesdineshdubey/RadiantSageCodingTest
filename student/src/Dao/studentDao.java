package Dao;

import java.sql.Connection;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Entity.student;

public class studentDao extends BaseDao{
	public static LinkedList<student> search(String age) {
		LinkedList<student> res = new LinkedList<>();
		Connection con = null;
		try {
			con = getCon();
			String sql = "select * from student_info where student_age like ?";
			PreparedStatement st = con.prepareStatement(sql);
			int i = 1;
			st.setString(i++, "%" + age + "%");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				student s1 = new student();
				s1.setStudentId(rs.getInt(("student_id")));
				s1.setStudentName((rs.getString("student_name")));
				s1.setstudentAge((rs.getInt("student_age")));
				res.add(s1);
				
				//filtering using streams
				List<student> li = res.stream().filter(e -> e.getstudentAge() > 10).collect(Collectors.toList());
				
				//filtering without streams
//				for(student s : res){
//				    if(s.getstudentAge()> 10){
//				      res.add(s);
//				    }
//				}
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeCon(con);
		}
		return res;
	}

	public static void insert(student s1) {
		Connection con = null;
		try {
			con = getCon();
			String sql = "insert into student_info " + "(student_id,student_name,student_city) values(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			int i = 1;
			st.setInt(i++, s1.getStudentId());
			st.setString(i++, s1.getStudentName());
			st.setInt(i++, s1.getstudentAge());
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeCon(con);
		}
	}

	public static void update(student s2) {
		Connection con = null;
		try {
			con = getCon();
			String sql = "update student_info set " + "student_name = ? , student_city = ?" + "where student_id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			int i = 1;
			st.setInt(i++, s2.getStudentId());
			st.setString(i++, s2.getStudentName());
			st.setInt(i++, s2.getstudentAge());
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeCon(con);
		}
	}

	public static void delete(student  s3) {
		Connection con = null;
		try {
			con = getCon();
			String sql = "delete from student_info " + "where student_id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			int i = 1;
			st.setInt(i++, s3.getStudentId());
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeCon(con);
		}
	}
	
	

}
