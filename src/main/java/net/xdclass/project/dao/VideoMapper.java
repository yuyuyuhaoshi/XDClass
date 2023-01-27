package net.xdclass.project.dao;

import net.xdclass.project.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
    Video selectById(@Param("id") int videoId);

    @Select("select * from video;")
    List<Video> selectList();


    List<Video> selectListByPriceAndName(@Param("price") double price, @Param("name")  String name);


}
