/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service.action;

import com.opensymphony.xwork2.ActionSupport;
import service.facades.UserServiceFacade;

/**
 *
 * @author Geza
 */

public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String execute() throws Exception {
        if (UserServiceFacade.logUserIn(username, password)){
            return "SUCCESS";
        }
        return "ERROR";
    }

}