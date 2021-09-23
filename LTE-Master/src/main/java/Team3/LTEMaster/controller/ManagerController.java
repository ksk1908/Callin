package Team3.LTEMaster.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import Team3.LTEMaster.DTO.Teacher;
import Team3.LTEMaster.Service.TeacherService;


@Controller
public class ManagerController {
	private final TeacherService teacherService;
		
	public ManagerController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	@GetMapping("/managerList")
	public String teacherList(Model model){ 
		System.out.println("constroller 실행");
		
		List<Teacher> teacherList = teacherService.getTeacherList();
		System.out.println(teacherList);
		model.addAttribute("title", "매니저 목록");
		model.addAttribute("teacherList",teacherList); 
		
		return "manager/managerList"; 
	}
	
	@GetMapping("/managerSalary")
	public String teacherSalary(@RequestParam(name="teacherId", required = false) String teacherId,
								Model model) {
		if(teacherId!=null) {
		Teacher teacher = teacherService.getTeacherInfoById(teacherId);
		System.out.println(teacher+"★★★★★★★★★★★★★★★★★");
		model.addAttribute("teacherId", teacher.getTeacherId());
		model.addAttribute("teacherName", teacher.getTeacherName());
		model.addAttribute("ContractType", teacher.getContractType());
		model.addAttribute("HourlyRate", teacher.getHourlyRate());
		}
		System.out.println("GET으로 실행");
		model.addAttribute("title", "매니저 급여 정산");
		model.addAttribute("midTitle", "매니저 급여 정산");
		model.addAttribute("cardTitle", "매니저 상세 정보");
			
		return "manager/managerSalary";
		}
	@PostMapping("/managerSalary")
	public String teacherSalaryPost(Teacher teacherInfo, Model model) {
		System.out.println("★★★★★★★★★★★★★★★★★"+teacherInfo);
		Teacher teacher = teacherService.getTeacherInfoById("id001");
		System.out.println(teacher+"★★★★★★★★★★★★★★★★★");
		model.addAttribute("teacherId", teacher.getTeacherId());
		model.addAttribute("teacherName", teacher.getTeacherName());
		model.addAttribute("ContractType", teacher.getContractType());
		model.addAttribute("HourlyRate", teacher.getHourlyRate());
		return "manager/managerSalary";
	}


}

