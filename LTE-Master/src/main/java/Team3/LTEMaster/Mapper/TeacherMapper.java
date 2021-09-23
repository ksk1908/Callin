package Team3.LTEMaster.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import Team3.LTEMaster.DTO.Teacher;

@Mapper
public interface TeacherMapper {
	public List<Teacher> getTeacherList();
	public Teacher getTeacherInfoById(String teacherId);
}
