package cn.tinycourse.mapper;

import cn.tinycourse.pojo.Pratice;
import cn.tinycourse.pojo.PraticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PraticeMapper {
    int countByExample(PraticeExample example);

    int deleteByExample(PraticeExample example);

    int deleteByPrimaryKey(Integer praId);

    int insert(Pratice record);

    int insertSelective(Pratice record);

    List<Pratice> selectByExample(PraticeExample example);

    Pratice selectByPrimaryKey(Integer praId);

    int updateByExampleSelective(@Param("record") Pratice record, @Param("example") PraticeExample example);

    int updateByExample(@Param("record") Pratice record, @Param("example") PraticeExample example);

    int updateByPrimaryKeySelective(Pratice record);

    int updateByPrimaryKey(Pratice record);
}