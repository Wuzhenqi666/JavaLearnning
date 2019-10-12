package com.wuzhenqi.java.User;

import java.util.Date;

/**
 * @author JemLeeo
 * @date 2019/10/10 21:02
 */
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        this.name = name;
    }
}
