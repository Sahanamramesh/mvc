package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.EmployeeDao;
import emp.dto.Employee;
@Controller
@Component
public class EmployeeController {
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeDao dao;
	
	@GetMapping("load")
	public ModelAndView loadEmployee(){
		ModelAndView view=new ModelAndView("Signup.jsp");
		view.addObject("emp", employee);
		return view;
	}
	@PostMapping("Signup")
	public ModelAndView saveEmployee(@ModelAttribute Employee emp){
		dao.saveEmployee(emp);
		ModelAndView view=new ModelAndView("Login.jsp");
		view.addObject("msg", "Account created successfully");
		return view;
	}
	@PostMapping("login")
	public ModelAndView login(@RequestParam String email,@RequestParam String pwd)
	{
		ModelAndView andView=new ModelAndView();
		Employee employee=dao.login(email);
		if(employee==null){
			andView.setViewName("Login.jsp");
			andView.addObject("msg","Invalid Email");
		}else{
			if(pwd.equals(employee.getPassword())){
				andView.setViewName("Result.jsp");
				andView.addObject("list",dao.fetchAll());
				andView.addObject("msg","Logged in successfully");
			}else{
				andView.setViewName("Login.jsp");
				andView.addObject("msg","Invalid passwprd");
			}
		}
		return andView;
	}
}
