package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentMango;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.service.impl.StudentServiceImplMango;

@RestController
@RequestMapping("/Student")
public class HomeController {
	@Autowired
    private StudentServiceImpl studentService;
	@Autowired
    private StudentServiceImplMango StudentServicemango;
	//SQL Database CRUD operations
    // Post data to the DataBase
    @PostMapping("/saveStudent")
    public ResponseEntity<?> saveData(@RequestBody Student student) {
        Student response = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    // Get all data from the DataBase
    @GetMapping("/Getall")
    public ResponseEntity<?> getAll() {
        List<Student> response = studentService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    // Get specific data from the DataBase using id
    @GetMapping("/GetbyId/{Id}")
    public ResponseEntity<?> getById(@PathVariable int Id) {
        Student response = studentService.getbyId(Id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    // Update specific data in the DataBase using id
	@PutMapping("/updatebyId/{rollNo}")
    public ResponseEntity<?> UpdateById(@PathVariable int rollNo,@RequestBody Student student) {
        String response = studentService.updateStudentData(rollNo,student);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
	// Get specific data from the DataBase Within a range by getting start and end id's
	@GetMapping("/getbyrange/{start}/{end}")
	public ResponseEntity<?> getByRange(@PathVariable int start,@PathVariable int end) {
        List<Student> response = studentService.getByRange(start,end);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
	// Delete specific data from the DataBase using id
	@DeleteMapping("/DeleteById/{Id}")
	 public ResponseEntity<?> deleteStudent(@PathVariable int Id) {
       String response = studentService.deleteStudentById(Id);
       return ResponseEntity.status(HttpStatus.OK).body(response);
   }
	//MangoDB CRUD operations
	// Post data to the DataBase
	@PostMapping("/saveStudent1")
    public ResponseEntity<?> saveData1(@RequestBody StudentMango studentMango) {
		StudentMango response = StudentServicemango.createStudent(studentMango);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
	// Get all data from the DataBase
    @GetMapping("/Getall1")
    public ResponseEntity<?> getAll1() {
        List<StudentMango> response = StudentServicemango.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
 // Get specific data from the DataBase using id
    @GetMapping("/GetbyId1/{Id}")
    public ResponseEntity<?> getById1(@PathVariable int Id) {
        StudentMango response = StudentServicemango.getById(Id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    // Get specific data from the DataBase Within a range by getting start and end id's
	@GetMapping("/getbyrange1/{start}/{end}")
	public ResponseEntity<?> getByRange1(@PathVariable int start,@PathVariable int end) {
        List<StudentMango> response = StudentServicemango.getByRange(start,end);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    // Update specific data in the DataBase using id
 	@PutMapping("/updatebyId1/{rollNo}")
     public ResponseEntity<?> UpdateById1(@PathVariable int rollNo,@RequestBody StudentMango student) {
         String response = StudentServicemango.updateStudentData(rollNo,student);
         return ResponseEntity.status(HttpStatus.OK).body(response);
    }
 // Delete specific data from the DataBase using id
	@DeleteMapping("/DeleteById1/{Id}")
	 public ResponseEntity<?> deleteStudent1(@PathVariable int Id) {
        String response = StudentServicemango.deleteStudentById(Id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
