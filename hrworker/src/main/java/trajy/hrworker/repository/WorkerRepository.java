package trajy.hrworker.repository;

import org.springframework.stereotype.Repository;
import trajy.hrworker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
