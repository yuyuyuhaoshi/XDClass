package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("jack", new User(1, "jack", "123"));
        userMap.put("tom", new User(2, "tom", "123"));
        userMap.put("jerry", new User(3, "jerry", "123"));
    }

    public User login(String username, String password) {
        User user = userMap.get(username);
        if (user == null) {
            return null;
        }

        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<User> userList() {
        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }
}
