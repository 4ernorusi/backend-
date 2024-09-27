package origin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import origin.model.project.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
