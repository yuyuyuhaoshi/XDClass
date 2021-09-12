package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1, new Video(1, "Java"));
        videoMap.put(2, new Video(2, "Golang"));
        videoMap.put(3, new Video(3, "Spring"));
    }

    public List<Video> videoList() {
        List<Video> lisVideo = new ArrayList<>();
        lisVideo.addAll(videoMap.values());
        return lisVideo;
    }
}
