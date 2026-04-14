package com.projectmannage.ProjetMannage.domain.entity;

import com.projectmannage.ProjetMannage.model.ProjectStatus;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.Objects;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private String id;
    private String name;
    private String description;
    private LocalDate initial_date;
    private LocalDate final_date;
    private ProjectStatus status;

}
