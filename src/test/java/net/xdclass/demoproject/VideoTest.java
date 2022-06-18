package net.xdclass.demoproject;

import junit.framework.TestCase;
import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoProjectApplication.class)
@AutoConfigureMockMvc
public class VideoTest {
    @Autowired
    private VideoService videoService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVideoList() {
        List<Video> videoList = videoService.videoList();
        TestCase.assertTrue(videoList.size() > 0);
    }

    @Test
    public void testVideoListApi() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        String result = mvcResult.getResponse().getContentAsString(StandardCharsets.UTF_8);
        System.out.println(result);

    }
}
