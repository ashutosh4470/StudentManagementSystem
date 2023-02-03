package net.atdev.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.atdev.sms.entity.Student;
import net.atdev.sms.repository.StudentRepository;
import net.atdev.sms.service.StudentService;

/******
 * @author :Ashutosh Mahale
 * @Date :03-02-2023
 *****/

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
