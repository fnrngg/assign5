package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import manager.Manager;

/**
 * Application Lifecycle Listener implementation class ManagerListener
 *
 */
@WebListener
public class ManagerListener implements ServletContextListener {

	private Manager accounts;
	
    /**
     * Default constructor. 
     */
    public ManagerListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  {
    	accounts.clear();
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         accounts = new Manager();
         sce.getServletContext().setAttribute("Manager", accounts);
    }
	
}
