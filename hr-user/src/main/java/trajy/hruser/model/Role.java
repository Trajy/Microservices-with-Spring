package trajy.hruser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    String roleName;

    public Role() { }

    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
