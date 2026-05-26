package com.projectmannage.ProjetMannage.infrastructure.exception;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class RestError {
    private final String errorCode;
    private final String errorMenssage;
    private final List<String> details;
    private final String status;
    private final String path;
}
