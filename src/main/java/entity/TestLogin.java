package entity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

public class TestLogin {

    private String login;
    private String password;
    private String inform;

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

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

    public void addTest(String login){

    }
}
