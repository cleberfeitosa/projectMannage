package com.projectmannage.ProjetMannage.domain.entity;

import com.projectmannage.ProjetMannage.domain.model.TaskStatus;

public class Task {

    private String id;
    private String title;
    private String description;
    private Integer numberOfDays;
    private TaskStatus status;
    private Project project;
    private Member assignMember;
}
