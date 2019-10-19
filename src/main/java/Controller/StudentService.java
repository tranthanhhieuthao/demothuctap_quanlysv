package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import BO.Student;

@ManagedBean(name ="StudentService")
@ApplicationScoped
@SessionScoped
public class StudentService {

	public List<Student> listStudent(){
 List<Student> listStudent =new ArrayList<Student>();
 listStudent.add(new Student(1,"Hieu",27,"Nghe An",0374006604,"tranhieu@gmail.com","khong co gi"));
 listStudent.add(new Student(2,"Thao",25,"Ha Noi",0366565,"tranthao@gmail.com","khong co gi"));
 listStudent.add(new Student(3,"Chi",25,"Nghe An",0374006604,"tranchi@gmail.com","khong co gi"));
 listStudent.add(new Student(4,"Quang",28,"Nghe An",0374006604,"tranquang@gmail.com","khong co gi"));
 listStudent.add(new Student(5,"Hai",29,"Nghe An",0374006604,"nguyenhai@gmail.com","khong co gi"));
 return listStudent;
	}
}

