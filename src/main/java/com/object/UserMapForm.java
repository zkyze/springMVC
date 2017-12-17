package com.object;

import java.util.Map;

/**
 * Created by zkyze on 2017/9/27.
 */
public class UserMapForm {
    private Map<String,User> users;

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserMapForm{" +
                "users=" + users +
                '}';
    }
}
