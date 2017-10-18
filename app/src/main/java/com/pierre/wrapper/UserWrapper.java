package com.pierre.wrapper;

import com.google.gson.Gson;
import com.pierre.metier.User;

import java.util.List;

/**
 * Created by pierre on 18/10/2017.
 */

public class UserWrapper {
    public User user;

    public static UserWrapper fromJson(String s) {
        return new Gson().fromJson(s, UserWrapper.class);
    }
    public String toString() {
        return new Gson().toJson(this);
    }
}