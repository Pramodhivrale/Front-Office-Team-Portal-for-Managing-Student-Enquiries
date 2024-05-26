package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CourseEntity;

@Repository
public interface CourseListRepo extends JpaRepository<CourseEntity, Integer>{

}