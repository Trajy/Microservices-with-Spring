package trajy.hroauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import trajy.hroauth.client.UserClient;
import trajy.hroauth.model.User;
import static trajy.hroauth.model.UserDetailsImpl.UserDetailsImplBuilder;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserClient client;

    public User findByEmail(String email) {
        return client.findByEmail(email).getBody();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return new UserDetailsImplBuilder().user(findByEmail(email)).build();
    }
}
