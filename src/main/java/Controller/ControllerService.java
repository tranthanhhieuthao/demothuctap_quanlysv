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

	public String addStudent() {
		lists.add(student);
		return "ListStudent";

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
