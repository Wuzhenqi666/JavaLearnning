package com.wuzhenqi.java.User;

import java.util.Date;

/**
 * @author JemLeeo
 * @date 2019/10/10 21:03
 */
public class Equal {
    public static void main(String[] args) {
        User user = new User("jemleeo");
        User user1 = new User("jemleeo");
        if(user1.equals(user1)){
            System.out.println("1");
        }else {
            System.out.println("2");
        }
    }
}
