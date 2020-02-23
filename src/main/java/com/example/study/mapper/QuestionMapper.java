package com.example.study.mapper;

import com.example.study.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,gmt_creat,gmt_modified,creator,tags) values (#{title},#{description},#{gmtCreat},#{gmtModified},#{creator},#{tags})")
    void insert(Question question);

}
