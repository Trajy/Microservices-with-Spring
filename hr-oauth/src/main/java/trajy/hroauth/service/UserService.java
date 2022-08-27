package trajy.hroauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trajy.hroauth.client.UserClient;
import trajy.hroauth.model.User;

@Service
public class UserService {

    @Autowired
    private UserClient client;

    public User findByEmail(String email) {
        return client.findByEmail(email).getBody();
    }
}
