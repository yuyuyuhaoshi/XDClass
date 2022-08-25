package net.xdclass.demoproject.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderSchedule {
    @Scheduled(fixedRate = 1 * 1000)
    public void sun(){
        System.out.println("统计总和");
    }
}
