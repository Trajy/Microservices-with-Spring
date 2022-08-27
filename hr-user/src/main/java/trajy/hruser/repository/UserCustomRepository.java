package trajy.hruser.repository;

import trajy.hruser.model.User;

public interface UserCustomRepository {

    User findByEmail(String email);

}
