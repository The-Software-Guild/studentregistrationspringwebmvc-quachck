package com.wileyedge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wileyedge.model.Student;
import com.wileyedge.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Student student, Model model) {
		try {
			studentService.saveStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("student", student);
		return "success";
	}
}
