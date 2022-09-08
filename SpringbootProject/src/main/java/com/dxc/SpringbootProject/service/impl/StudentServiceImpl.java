package com.dxc.SpringbootProject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.SpringbootProject.entity.Student;
import com.dxc.SpringbootProject.repository.StudentRepository;
import com.dxc.SpringbootProject.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepo;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepo = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
	}
}
