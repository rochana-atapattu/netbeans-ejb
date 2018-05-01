/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Rochana
 * create a singleton session bean in the web module 
 * that will count the number of users that are 
 * currently in the session
 */
@Singleton
@LocalBean
@WebListener
public class SessionManagerBeans implements HttpSessionListener{

    private static int count=0;
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public int getCount(){
        return this.count;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
