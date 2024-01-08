package com.example.ikram.student.services;

import com.example.ikram.student.entity.Student;
import com.example.ikram.student.repository.StudentRepository;
import org.apache.commons.codec.language.bm.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public  StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

}
