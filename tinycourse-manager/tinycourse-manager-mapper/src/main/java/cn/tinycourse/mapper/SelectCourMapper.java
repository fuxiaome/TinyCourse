package cn.tinycourse.mapper;

import cn.tinycourse.pojo.SelectCour;
import cn.tinycourse.pojo.SelectCourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectCourMapper {
    int countByExample(SelectCourExample example);

    int deleteByExample(SelectCourExample example);

    int deleteByPrimaryKey(Integer selCourId);

    int insert(SelectCour record);

    int insertSelective(SelectCour record);

    List<SelectCour> selectByExample(SelectCourExample example);

    SelectCour selectByPrimaryKey(Integer selCourId);

    int updateByExampleSelective(@Param("record") SelectCour record, @Param("example") SelectCourExample example);

    int updateByExample(@Param("record") SelectCour record, @Param("example") SelectCourExample example);

    int updateByPrimaryKeySelective(SelectCour record);

    int updateByPrimaryKey(SelectCour record);
}