package com.websystique.springboot.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anil Chowdhury
 *         Created on 11/6/2018.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
