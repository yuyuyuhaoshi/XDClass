package net.xdclass.project.controller;

import net.xdclass.project.utils.JsonData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pri/order")
public class VideoOrderController {
    @PostMapping("save")
    public JsonData saveOrder(){
        return JsonData.buildSuccess("success");
    }
}
