package com.example.ikram.student.repository;

import com.example.ikram.student.entity.Student;
import org.apache.commons.codec.language.bm.Lang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Lang> {

}
