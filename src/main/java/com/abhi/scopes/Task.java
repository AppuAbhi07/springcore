package com.abhi.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Prototype scope
public class Task {
	
	
	private final String taskId;

    public Task() {
        this.taskId = "TASK-" + System.currentTimeMillis();
    }

    public String getTaskId() {
        return taskId;
    }

    @Override
    public String toString() {
        return "Task [taskId=" + taskId + "]";
    }
	

}
