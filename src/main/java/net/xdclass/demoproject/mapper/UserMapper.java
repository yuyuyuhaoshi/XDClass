package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {
    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1, new User(1, "jack", "123"));
        userMap.put(2, new User(2, "tom", "123"));
        userMap.put(2, new User(3, "jerry", "123"));

    }
}
