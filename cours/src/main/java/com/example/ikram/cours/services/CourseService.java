package com.example.ikram.cours.services;

import com.example.ikram.cours.repository.CoursRepository;
import com.example.ikram.eurika.entity.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CoursRepository coursRepository;

    public Cours createCours(Cours c){
        coursRepository.sa
    }
}
