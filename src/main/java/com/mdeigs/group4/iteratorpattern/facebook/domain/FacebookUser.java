package com.mdeigs.group4.iteratorpattern.facebook.domain;

public class FacebookUser {

    private final String fbName;
    private final String fbUrl;

    public FacebookUser(String fbName) {
        this.fbName = fbName;
        this.fbUrl = "http://facebook.com/profile/" + fbName;
    }

    @Override
    public String toString() {
        return String.format("FUser: %s, Url: %s", this.fbName, this.fbUrl);
    }
}
