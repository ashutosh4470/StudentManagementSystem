package net.atdev.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.atdev.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
