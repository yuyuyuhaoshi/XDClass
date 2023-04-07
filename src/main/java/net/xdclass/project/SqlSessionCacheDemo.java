package net.xdclass.project;

import net.xdclass.project.dao.VideoMapper;
import net.xdclass.project.dao.VideoOrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionCacheDemo {
    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置⽂件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session⼯⼚
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try {
            // 测试二级缓存
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            VideoMapper videoMapper = sqlSession1.getMapper(VideoMapper.class);
            System.out.println(videoMapper.selectResultMapById(1));
            sqlSession1.commit();


            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            VideoMapper videoMapper2 = sqlSession2.getMapper(VideoMapper.class);
            System.out.println(videoMapper2.selectResultMapById(1));
            sqlSession1.commit();
//            System.out.println( videoOrderMapper.queryOrders());
//            List<User> users = videoOrderMapper.queryUserOrders();
//            System.out.println(users);
//
//            System.out.println(1 == 1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
