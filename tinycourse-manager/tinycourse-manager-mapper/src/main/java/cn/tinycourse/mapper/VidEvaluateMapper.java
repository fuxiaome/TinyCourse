package cn.tinycourse.mapper;

import cn.tinycourse.pojo.VidEvaluate;
import cn.tinycourse.pojo.VidEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VidEvaluateMapper {
    int countByExample(VidEvaluateExample example);

    int deleteByExample(VidEvaluateExample example);

    int deleteByPrimaryKey(Integer vidEvaId);

    int insert(VidEvaluate record);

    int insertSelective(VidEvaluate record);

    List<VidEvaluate> selectByExample(VidEvaluateExample example);

    VidEvaluate selectByPrimaryKey(Integer vidEvaId);

    int updateByExampleSelective(@Param("record") VidEvaluate record, @Param("example") VidEvaluateExample example);

    int updateByExample(@Param("record") VidEvaluate record, @Param("example") VidEvaluateExample example);

    int updateByPrimaryKeySelective(VidEvaluate record);

    int updateByPrimaryKey(VidEvaluate record);
}