package com.mdeigs.group4.iteratorpattern.facebook;

import com.mdeigs.group4.iteratorpattern.facebook.domain.FacebookUser;

import java.util.Arrays;
import java.util.List;

public class FacebookApi {
    private FacebookApi() {
    }

    public static List<FacebookUser> getFacebookUsers() {
        return Arrays.asList(
                new FacebookUser("LuisRoberto"),
                new FacebookUser("David"),
                new FacebookUser("Oscar")
        );
    }
}
