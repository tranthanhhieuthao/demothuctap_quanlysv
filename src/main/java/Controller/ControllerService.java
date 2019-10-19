package Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import BO.Student;

@ManagedBean(name = "controller", eager = true)
@SessionScoped
public class ControllerService implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Student> lists;

//	private Student student;

	@ManagedProperty(value = "#{StudentService}")
	private StudentService studentservice;

	@ManagedProperty(value = "#{StudentParent}")
	private Student student;

	public ControllerService() {
		lists = new ArrayList<Student>();
		studentservice = new StudentService();
		lists = studentservice.listStudent();
	}

	public List<Student> getLists() {
		return lists;
	}

	public void setLists(List<Student> lists) {
		this.lists = lists;
	}

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String DetailStudent(int id) {
		this.student = findById(id);
		return "DetailStudent?faces-redirec=true";
	}

	public String EditStudent(int id) {
		this.student = findById(id);
		return "EditStudent?faces-redirec=true";
	}

	public String addStudent() {
		this.student = new Student(lists.size()+1,null,0,null,0,null,null);
		lists.add(student);
		return "AddStudent?faces-redirec=true";

	}

	public Student findById(int id) {
		Student studentFindById = new Student();
		for (Student i : lists) {
			if (id == i.getId())
				studentFindById = i;
		}
		return studentFindById;
	}

	public String deleteStudent(int id) {
		Student toRemove = findById(id);
		lists.remove(toRemove);
		return "null";

	}

}
