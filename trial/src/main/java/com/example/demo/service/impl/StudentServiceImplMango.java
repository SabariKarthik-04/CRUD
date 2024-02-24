package com.example.demo.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentMango;
import com.example.demo.repository.StudentRepoMango;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImplMango implements StudentService {
	@Autowired
	private StudentRepoMango studentRepo;
	public StudentMango createStudent(StudentMango student) {
		return studentRepo.save(student);
	}
	public List<StudentMango> getAll() {
		return studentRepo.findAll();
	}
	public StudentMango getById(int Id) {
		Optional<StudentMango> studentData = studentRepo.findById(Id);
		return studentData.orElse(null);
	}
	public String updateStudentData(int rollNo, StudentMango student) {
		Optional<StudentMango> studentOptional = studentRepo.findById(rollNo);
		if (!studentOptional.isPresent()) {
			return "Student with roll number " + rollNo + " not found";
		}
		studentRepo.save(student);
		return "Updated Successfully";
	}
	public List<StudentMango> getByRange(int start,int end) {
		List<StudentMango> studentList = new ArrayList<>();
		for(int i=start;i<=end;i++) {
			Optional<StudentMango> optionalStudent = studentRepo.findById(i);
			if (optionalStudent.isPresent()) {
				StudentMango student = optionalStudent.get();
				studentList.add(student);
		}
		}
		return studentList;
		}
	public String deleteStudentById(int id) {
		StudentMango student = studentRepo.findById(id).get();
		if (student!=null)
			studentRepo.delete(student);
		return "Deleted Successfully";
	}
}

