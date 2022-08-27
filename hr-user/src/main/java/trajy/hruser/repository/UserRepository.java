package trajy.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trajy.hruser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {

}
