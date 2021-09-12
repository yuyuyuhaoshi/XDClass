package net.xdclass.demoproject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 视频控制器
 */


@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("list")
    public JsonData list() throws JsonProcessingException {
        List<Video> list = videoService.videoList();
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonStr = objectMapper.writeValueAsString(list);
//        System.out.println(jsonStr);
//        List<Video> temp = objectMapper.readValue(jsonStr, List.class);
        return JsonData.buildSuccess(list);
    }

    @PostMapping("chapter")
    public Object saveVideoChapter(@RequestBody Video video) {
        System.out.println(video.toString());
        return JsonData.buildSuccess(video);
    }

}
