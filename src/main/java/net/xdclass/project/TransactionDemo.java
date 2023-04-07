package net.xdclass.project;

import net.xdclass.project.dao.VideoMapper;
import net.xdclass.project.dao.VideoOrderMapper;
import net.xdclass.project.domain.Video;
import net.xdclass.project.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TransactionDemo {
    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置⽂件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session⼯⼚
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取Session
        try {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            Video video = new Video();
            



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
