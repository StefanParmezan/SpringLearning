package org.StefanParmezan.Beans_Di_Ioc;

//@Component
class TaskService {

    private final Task task;
    private final User user;

    //@Autowired
    TaskService(Task task, User user) {
        this.task = task;
        this.user = user;
    }

    public void printTask() {
        System.out.println(user + " " + task);
    }
}
