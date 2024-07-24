package org.maduranga.model;

import java.util.Map;

public class User {
    private String userid;
    private String region;
    private Map<String, String> attributes;

    public User(String userid, String region, Map<String, String> attributes) {
        this.userid = userid;
        this.region = region;
        this.attributes = attributes;
    }

    public String getUserid() {
        return userid;
    }

    public String getRegion() {
        return region;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
