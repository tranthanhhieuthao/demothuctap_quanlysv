package BO;

import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private int id; 
	private String nameStudent;
	private int age;
	private String village;
	private int phone;
	private String email;
	private String note;
//	private  Date date;
	
	public Student(int id,String nameStudent,int age,String village,int phone,String email,String note) {
		this.id =id;
		this.nameStudent =nameStudent;
		this.age =age;
		this.village =village;
		this.phone =phone;
		this.email =email;
		this.note =note;
//		this.date =date;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVillage() {
		return village;
	}
	public void setVillaage(String village) {
		this.village = village;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public  String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
//	public  Date getDate() {
//		return date;
//	}
//	public  void setDate(Date date) {r
//		Student.date = date;
//	}
	
	
	
}

