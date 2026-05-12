package com.projectmannage.ProjetMannage.domain.applicationservice;

import com.projectmannage.ProjetMannage.domain.entity.Project;
import com.projectmannage.ProjetMannage.infrastructure.dto.SaveProjectDataDTO;
import com.projectmannage.ProjetMannage.domain.model.ProjectStatus;
import com.projectmannage.ProjetMannage.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProjectService {



    private final ProjectRepository projectRepository;

    @Transactional
    public Project createProject(SaveProjectDataDTO saveProjectData){
        Project project = Project
                .builder()
                .name(saveProjectData.getName())
                .description(saveProjectData.getDescription())
                .initialDate(saveProjectData.getInitialDate())
                .finalDate(saveProjectData.getFinalDate())
                .status(ProjectStatus.PEDDING)
                .build();

        projectRepository.save(project);
        log.info("Project created:{}", project);
        return project;
    }
}

