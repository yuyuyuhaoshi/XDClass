package net.xdclass.project;

import net.xdclass.project.dao.VideoMapper;
import net.xdclass.project.dao.VideoOrderMapper;
import net.xdclass.project.domain.User;
import net.xdclass.project.domain.Video;
import net.xdclass.project.domain.VideoOrder;
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
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);


//            System.out.println( videoOrderMapper.queryOrders());
//            List<User> users = videoOrderMapper.queryUserOrders();
//            System.out.println(users);
//
//            System.out.println(1 == 1);

//            System.out.println( videoOrderMapper.queryOrdersLazy());
            for (VideoOrder videoOrder: videoOrderMapper.queryOrdersLazy()){
                System.out.println(videoOrder.getVideoId());
//                System.out.println(videoOrder);
            }


        }
    }
}
