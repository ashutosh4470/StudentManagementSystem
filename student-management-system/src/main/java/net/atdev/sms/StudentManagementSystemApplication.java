package net.atdev.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.atdev.sms.entity.Student;
import net.atdev.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Ashutosh", "Mahale", "ashutosh@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Rohit", "Mahale", "rohit@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Aadi", "yogi", "aadi@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
