package com.codeclan.employeelab.employee.repositories;

import com.codeclan.employeelab.employee.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
