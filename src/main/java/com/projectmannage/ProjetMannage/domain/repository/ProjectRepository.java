package com.projectmannage.ProjetMannage.domain.repository;

import com.projectmannage.ProjetMannage.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
}
