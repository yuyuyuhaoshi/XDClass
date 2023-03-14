package net.xdclass.project;

import net.xdclass.project.dao.VideoMapper;
import net.xdclass.project.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
            System.out.println(video);
            video.setPrice(1.1);
            System.out.println(videoMapper.update(video));

            Video video1 = new Video();
            video1.setId(1);
            video1.setName("Video1");
            System.out.println(videoMapper.update(video1));

            System.out.println(videoMapper.selectListByPriceAndName(1.1, "Video1"));


            System.out.println(videoMapper.selectResultMapById(1));
//            System.out.println(video.toString());
//
//            List<Video> videoList = videoMapper.selectList();
//
//            System.out.println(videoList.toString());
//
//            Video video2 = new Video();
//            video2.setName("Video4");
//            video2.setSummary("Summary4");
//            video2.setCoverImage("CoverImage4");
//            video2.setPrice(4.0F);
////            int rows = videoMapper.insert(video2);
////            System.out.println(rows);
////            System.out.println(video2);
////            sqlSession.commit();
//
//
//            Video video3 = new Video();
//            video3.setName("Video5");
//            video3.setSummary("Summary5");
//            video3.setCoverImage("CoverImage5");
//            video3.setPrice(5.0F);
//
//
//            Video video4 = new Video();
//            video4.setName("Video6");
//            video4.setSummary("Summary6");
//            video4.setCoverImage("CoverImage6");
//            video4.setPrice(6.0F);
//
//            List<Video> videoList1 = new ArrayList<>();
//            videoList1.add(video3);
//            videoList1.add(video4);
//
//            int row = videoMapper.batchInsert(videoList1);

        }
    }
}
