package org.StefanParmezan.Beans_Di_Ioc;

//@Component
public class TaskService {

    private final Task task;
    private final User user;

    //@Autowired
    public TaskService(Task task, User user) {
        this.task = task;
        this.user = user;
    }

    public void printTask() {
        System.out.println(user + " " + task);
    }
}
