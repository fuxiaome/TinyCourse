package cn.tinycourse.mapper;

import cn.tinycourse.pojo.CourseGrade;
import cn.tinycourse.pojo.CourseGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseGradeMapper {
    int countByExample(CourseGradeExample example);

    int deleteByExample(CourseGradeExample example);

    int deleteByPrimaryKey(Integer courGraId);

    int insert(CourseGrade record);

    int insertSelective(CourseGrade record);

    List<CourseGrade> selectByExample(CourseGradeExample example);

    CourseGrade selectByPrimaryKey(Integer courGraId);

    int updateByExampleSelective(@Param("record") CourseGrade record, @Param("example") CourseGradeExample example);

    int updateByExample(@Param("record") CourseGrade record, @Param("example") CourseGradeExample example);

    int updateByPrimaryKeySelective(CourseGrade record);

    int updateByPrimaryKey(CourseGrade record);
}