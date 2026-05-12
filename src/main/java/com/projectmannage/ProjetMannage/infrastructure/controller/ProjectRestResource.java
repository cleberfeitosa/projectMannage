package com.projectmannage.ProjetMannage.infrastructure.controller;

import com.projectmannage.ProjetMannage.domain.applicationservice.ProjectService;
import com.projectmannage.ProjetMannage.domain.entity.Project;

import com.projectmannage.ProjetMannage.infrastructure.dto.ProjectDTO;
import com.projectmannage.ProjetMannage.infrastructure.dto.SaveProjectDataDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

import static com.projectmannage.ProjetMannage.infrastructure.constant.RestConstants.PATH_PROJECTS;

@RestController
@RequestMapping(PATH_PROJECTS)
@AllArgsConstructor
public class ProjectRestResource {

    private  final ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectDTO> createProject(@RequestBody SaveProjectDataDTO saveProjectDataDTO){
        Project project = projectService.createProject(saveProjectDataDTO);
        return ResponseEntity.created(URI.create(PATH_PROJECTS+ "/" + project.getId())).body(ProjectDTO.create(project));
    }
}
