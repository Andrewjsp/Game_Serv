package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "users")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence_id")
    @SequenceGenerator(name = "user_sequence_id",sequenceName = "user_sequence",allocationSize =1)
    private long id;
    private String login;
    private String password;

    @OneToMany(mappedBy = "user")
   private List<Token> tokens;

    public List<Token> getToken() {
        return tokens;
    }

    public void setToken(List<Token> token) {
        this.tokens = token;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
