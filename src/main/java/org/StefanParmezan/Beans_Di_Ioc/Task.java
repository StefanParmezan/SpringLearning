package org.StefanParmezan.Beans_Di_Ioc;


//@Component
public class Task {
    private final String taskname;
    private final Integer tasktime;

    public Task() {
        this.taskname = "task1";
        this.tasktime = 56;
    }

    public String getTaskname() {
        return taskname;
    }

    public Integer getTasktime() {
        return tasktime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskname='" + taskname + '\'' +
                ", tasktime=" + tasktime +
                '}';
    }
}
