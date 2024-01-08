package com.example.ikram.cours.services;

import com.example.ikram.cours.entity.Cours;
import com.example.ikram.cours.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CoursRepository coursRepository;

    private Cours Create(Cours c){
       Cours cours= coursRepository.save(c);
       return cours;

    }
    private Cours findCoursById(Long id ){
        Cours cours = coursRepository.findBy(id);
        return  cours;
    }

}
