package org.StefanParmezan.Beans_Di_Ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
        Task t1 = context.getBean(Task.class);
        Task t2 = (Task) context.getBean(Task.class);
        TaskService taskService = context.getBean(TaskService.class);
        taskService.printTask();
    }
}