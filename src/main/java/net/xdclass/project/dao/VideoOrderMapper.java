package net.xdclass.project.dao;

import net.xdclass.project.domain.User;
import net.xdclass.project.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {
    List<VideoOrder> queryOrders();
    List<User> queryUserOrders();
}
