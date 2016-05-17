package cn.tinycourse.mapper;

import cn.tinycourse.pojo.ResEvaluate;
import cn.tinycourse.pojo.ResEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResEvaluateMapper {
    int countByExample(ResEvaluateExample example);

    int deleteByExample(ResEvaluateExample example);

    int deleteByPrimaryKey(Integer resEvaId);

    int insert(ResEvaluate record);

    int insertSelective(ResEvaluate record);

    List<ResEvaluate> selectByExample(ResEvaluateExample example);

    ResEvaluate selectByPrimaryKey(Integer resEvaId);

    int updateByExampleSelective(@Param("record") ResEvaluate record, @Param("example") ResEvaluateExample example);

    int updateByExample(@Param("record") ResEvaluate record, @Param("example") ResEvaluateExample example);

    int updateByPrimaryKeySelective(ResEvaluate record);

    int updateByPrimaryKey(ResEvaluate record);
}