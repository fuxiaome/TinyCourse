package cn.tinycourse.mapper;

import cn.tinycourse.pojo.ResArticle;
import cn.tinycourse.pojo.ResArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResArticleMapper {
    int countByExample(ResArticleExample example);

    int deleteByExample(ResArticleExample example);

    int deleteByPrimaryKey(Integer resArtId);

    int insert(ResArticle record);

    int insertSelective(ResArticle record);

    List<ResArticle> selectByExample(ResArticleExample example);

    ResArticle selectByPrimaryKey(Integer resArtId);

    int updateByExampleSelective(@Param("record") ResArticle record, @Param("example") ResArticleExample example);

    int updateByExample(@Param("record") ResArticle record, @Param("example") ResArticleExample example);

    int updateByPrimaryKeySelective(ResArticle record);

    int updateByPrimaryKey(ResArticle record);
}