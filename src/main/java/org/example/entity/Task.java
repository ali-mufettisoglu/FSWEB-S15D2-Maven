package org.example.entity;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

}
