package trajy.hroauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trajy.hroauth.model.User;
import trajy.hroauth.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class OauthController {

    @Autowired
    UserService service;

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        User user = service.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
