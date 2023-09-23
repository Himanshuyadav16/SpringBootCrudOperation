package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    Student student;

    @GetMapping("{studentId}")
    public Student getStudents(int studentId){
        return student;
       // return new Student("John","john12@gmail.com",1);
    }

    @PostMapping()
    public Student createStudent(@RequestBody Student student){
       this.student=student;
        return student;
    }

    @PutMapping()
    public Student updateStudent(@RequestBody Student student){
        this.student=student;
        return student;
    }

    @DeleteMapping("{studentId}")
    public String deleteStudent(int studentId){
        this.student=null;
        return "No data" ;
    }


}
