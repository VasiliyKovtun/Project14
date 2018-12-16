package com.it.Users;

import com.it.Utils.Utils;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {


    static ResourceBundle bundle = ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return new User(bundle.getString("validLogin"),
                bundle.getString("validPassword"),
                bundle.getString("validEmail"));

    }

    public static ArrayList<User> getRandomUser(int count) {
        ArrayList<User> collect= (ArrayList<User>)
 Stream.generate(()->new User(
        Utils.Data.getRandomName(),
        Utils.Data.getRandomLastName(),
        Utils.Data.getRandomString(15),
        Utils.Data.getRandomString(16),
        Utils.Data.getRandomEmail())).limit(count).collect(Collectors.toList());
return collect;
    }
}

