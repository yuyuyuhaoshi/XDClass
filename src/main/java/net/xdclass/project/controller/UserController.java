package net.xdclass.project.controller;

import net.xdclass.project.domain.User;
import net.xdclass.project.service.UserService;
import net.xdclass.project.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {

  @Autowired public UserService userService;

  @PostMapping("login")
  public JsonData login(@RequestBody User user) {
    String token = userService.login(user.getUsername(), user.getPassword());
    return token != null ? JsonData.buildSuccess(token) : JsonData.buildFailed(401, "用户名密码不正确");
  }

  @GetMapping("list")
  public JsonData userList() {
    return JsonData.buildSuccess(userService.userList());
  }
}
