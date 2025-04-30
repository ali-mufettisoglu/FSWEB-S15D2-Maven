package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String term) {
        Set<Task> tasks = new HashSet<>();
        switch (term) {
            case "ann":
                tasks = annsTasks;
                break;
            case "bob":
                tasks = bobsTasks;
                break;
            case "carol":
                tasks = carolsTasks;
                break;
            case "all":
                tasks = getUnion(unassignedTasks,carolsTasks,annsTasks,bobsTasks);

        }
        return tasks;
    }

    public Set<Task> getUnion(Set<Task> ...tasks) {
        Set<Task> allTasks = new HashSet<>();
        for (Set<Task> tasksSet: tasks){
            allTasks.addAll(tasksSet);
        }
        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> task1,Set<Task> task2) {
        task1.retainAll(task2);
        return task1;
    }

    public Set<Task> getDifferences(Set<Task> task1,Set<Task> task2) {
        task1.removeAll(task2);
        return task1;
    }
}

