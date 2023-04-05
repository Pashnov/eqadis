package entities;

public class User extends AbstractEntity {

    private String email;

    public User(String id) {
        super(id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
