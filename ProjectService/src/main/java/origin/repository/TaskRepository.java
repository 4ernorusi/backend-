package origin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import origin.model.task.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
