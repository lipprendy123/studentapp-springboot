package com.example.tugas2.services;

import com.example.tugas2.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student("23001", "Alif Rendy", "2003-05-12", "Jakarta"));
        students.add(new Student("23002", "Dina Putri", "2002-11-30", "Bandung"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(String nim, Student updatedStudent) {
    for (Student student : students) {
        if (student.getNim().equals(nim)) {
            student.setFullName(updatedStudent.getFullName());
            student.setDob(updatedStudent.getDob());
            student.setAddress(updatedStudent.getAddress());
            return student;
        }
    }
    return null; 
}

public boolean deleteStudent(String nim) {
    return students.removeIf(student -> student.getNim().equals(nim));
}

}
