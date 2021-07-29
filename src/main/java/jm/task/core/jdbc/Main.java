package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Mickey", "Mouse", (byte) 5);
        userService.saveUser("Donald", "Duck", (byte) 4);
        userService.saveUser("Tom", "Cat", (byte) 3);
        userService.saveUser("Jerry", "Mouse", (byte) 2);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}
