package net.xdclass.project.service.impl;

import net.xdclass.project.domain.Video;
import net.xdclass.project.mapper.VideoMapper;
import net.xdclass.project.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> videoList() {
        return videoMapper.videoList();
    }
}
