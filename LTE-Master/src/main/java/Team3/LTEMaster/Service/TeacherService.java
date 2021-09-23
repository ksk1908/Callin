package Team3.LTEMaster.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Team3.LTEMaster.DTO.Teacher;
import Team3.LTEMaster.Mapper.TeacherMapper;

@Service
public class TeacherService {
	
	public final TeacherMapper teacherMapper;
	
	@Autowired
	public TeacherService(TeacherMapper teacherMapper) {
		this.teacherMapper = teacherMapper;
	}

	public List<Teacher> getTeacherList(){
		System.out.println("service.getTeacherList 실행");
		
		List<Teacher> teacherList = teacherMapper.getTeacherList();
		System.out.println("티쳐리스트"+teacherList);
		System.out.println(teacherList);
		
		return teacherList;
	}
	public Teacher getTeacherInfoById(String teacherId){
		System.out.println("service.getTeacherInfoById 실행");
		
		Teacher teacher = teacherMapper.getTeacherInfoById(teacherId);
		System.out.println("티쳐 한 명"+teacher);
		System.out.println(teacher);
		
		return teacher;
	}
		
}
