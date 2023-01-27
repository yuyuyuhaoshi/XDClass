package net.xdclass.project;

import net.xdclass.project.dao.VideoMapper;
import net.xdclass.project.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SqlSessionDemo {
    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置⽂件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session⼯⼚
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);

            Video video = videoMapper.selectById(1);

            System.out.println(video.toString());

            List<Video> videoList = videoMapper.selectList();

            System.out.println(videoList.toString());

            List<Video> video1 = videoMapper.selectListByPriceAndName(1, "2");
            System.out.println(video1);

        }

    }
}
