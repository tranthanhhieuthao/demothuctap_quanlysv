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

	private Student student;

	@ManagedProperty(value = "#{StudentService}")
	private StudentService studentservice;

	public ControllerService() {
		lists = new ArrayList<Student>();
		lists.add(new Student(1, "Hieu", 27, "Nghe An", 0374006604, "tranhieu@gmail.com", "khong co gi"));
		lists.add(new Student(2, "Thao", 25, "Ha Noi", 0366565, "tranthao@gmail.com", "khong co gi"));
		lists.add(new Student(3, "Chi", 25, "Nghe An", 0374006604, "tranchi@gmail.com", "khong co gi"));
		lists.add(new Student(4, "Quang", 28, "Nghe An", 0374006604, "tranquang@gmail.com", "khong co gi"));
		lists.add(new Student(5, "Hai", 29, "Nghe An", 0374006604, "nguyenhai@gmail.com", "khong co gi"));

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
		return null;
	}

	public String deleteStudent(int id) {
		lists.remove(id);
		return "ListStudent";

	}

}
