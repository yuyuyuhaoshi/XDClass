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
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {

            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);

            Video video = videoMapper.selectById(1);

            System.out.println(video.toString());

            List<Video> videoList = videoMapper.selectList();

            System.out.println(videoList.toString());

            Video video2 = new Video();
            video2.setName("Video4");
            video2.setSummary("Summary4");
            video2.setCoverImage("CoverImage4");
            video2.setPrice(4.0F);
            int rows = videoMapper.insert(video2);
            System.out.println(rows);
            System.out.println(video2);
            sqlSession.commit();


        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
