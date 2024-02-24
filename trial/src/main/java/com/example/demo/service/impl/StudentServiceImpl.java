package com.example.demo.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepo;
	public Student createStudent(Student student) {
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}
	
	public List<Student> getAll() {
		List<Student> student= studentRepo.findAll();
		return student;
	}
	
	public Student getbyId(int Id) {
		Student student = new Student();
		Optional<Student> studentData=studentRepo.findById(Id);
		if(studentData.isPresent())
			return studentData.get();
		return student;
	}
	public String updateStudentData(int rollNo,Student student) {
		Student studentList=studentRepo.findById(rollNo).get();
		if (studentList==null)
			return "Please Enter a correct Id";
		studentRepo.save(student);
		return "updated Successfully"+getbyId(rollNo);
	}
	public List<Student> getByRange(int start,int end) {
		List<Student> studentList = new ArrayList<>();
		for(int i=start;i<=end;i++) {
			Optional<Student> optionalStudent = studentRepo.findById(i);
			if (optionalStudent.isPresent()) {
				Student student = optionalStudent.get();
				studentList.add(student);
		}
		}
		return studentList;
		}
	public String deleteStudentById(int id) {
		Student student = studentRepo.findById(id).get();
		if (student!=null)
			studentRepo.delete(student);
		return "Deleted Successfully";
	}
	}

