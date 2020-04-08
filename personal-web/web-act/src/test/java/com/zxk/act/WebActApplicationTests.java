package com.zxk.act;

import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebActApplicationTests {
    @Autowired
    private TaskRuntime taskRuntime;

    @Test
    void contextLoads() {
        taskRuntime.create(
                TaskPayloadBuilder.create()
                        .withName("First Team Task")
                        .withDescription("This is something really important")
                        .withCandidateGroup("activitiTeam")
                        .withPriority(10)
                        .build());
    }

}
