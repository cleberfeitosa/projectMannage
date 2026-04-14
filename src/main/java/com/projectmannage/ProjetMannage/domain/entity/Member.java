package com.projectmannage.ProjetMannage.domain.entity;

import java.util.List;

public class Member {

    private String id;
    private String secret;
    private String name;
    private String email;
    private Boolean deleted;
    private List<Project> projects;
}
