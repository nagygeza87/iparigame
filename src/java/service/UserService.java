/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import model.HibernateUtil;
import model.dao.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Geza
 */
public class UserService {

    public static boolean authenticateUser(String username, String password){
        System.out.println(username + " " + password);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("username", username))
               .add(Restrictions.eq("password", password));
        if (((User) cr.uniqueResult()) != null)
            return true;
        else {
            System.err.println("No user with the matching name... Strange...");
            return false;
        }
    }

    

}
