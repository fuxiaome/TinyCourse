package cn.tinycourse.mapper;

import cn.tinycourse.pojo.ArtLike;
import cn.tinycourse.pojo.ArtLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtLikeMapper {
    int countByExample(ArtLikeExample example);

    int deleteByExample(ArtLikeExample example);

    int deleteByPrimaryKey(Integer artLikeId);

    int insert(ArtLike record);

    int insertSelective(ArtLike record);

    List<ArtLike> selectByExample(ArtLikeExample example);

    ArtLike selectByPrimaryKey(Integer artLikeId);

    int updateByExampleSelective(@Param("record") ArtLike record, @Param("example") ArtLikeExample example);

    int updateByExample(@Param("record") ArtLike record, @Param("example") ArtLikeExample example);

    int updateByPrimaryKeySelective(ArtLike record);

    int updateByPrimaryKey(ArtLike record);
}