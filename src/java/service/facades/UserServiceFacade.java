/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service.facades;

import service.UserService;

/**
 *
 * @author Geza
 */
public class UserServiceFacade {

    public static boolean logUserIn(String username, String password){
        if (username==null || username.trim().equals("") || password==null || password.trim().equals("")) {
            throw new IllegalArgumentException("Username or password is empty");
        }
        boolean userisauthentic = UserService.authenticateUser(username, password);
        if (userisauthentic==true) {
            System.err.println("Username or password mismatch");
            return true;
        }
        return false;
    }

}
