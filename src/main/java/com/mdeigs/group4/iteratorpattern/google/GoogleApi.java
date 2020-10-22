package com.mdeigs.group4.iteratorpattern.google;

import com.mdeigs.group4.iteratorpattern.google.domain.GoogleUser;

public class GoogleApi {
    private GoogleApi() {
    }

    public static GoogleUser[] getGoogleUsers() {
        return new GoogleUser[]{
                new GoogleUser("Danae", "d@gmail.com"),
                new GoogleUser("Joaquin", "j@gmail.com"),
                new GoogleUser("Brian", "b@gmail.com")
        };
    }
}
