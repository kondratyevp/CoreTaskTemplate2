package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        //Util util = new Util();
        //Util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        //userService.dropUsersTable();
        userService.saveUser("Mickey", "Mouse", (byte) 5);
    }
}
