package manager;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	
	private Map<String, String> users;
	
	public Manager() {
		users = new HashMap<String, String>();
		users.put("Patrick", "1234");
		users.put("Molly", "FloPup");
	}
	
	public void add(String name, String password) {
		users.put(name, password);
	}
	
	public boolean containsName(String name) {
		return users.containsKey(name);
	}
	
	public boolean containsUser(String name, String password) {
		return containsName(name) && users.get(name).equals(password);
	}
	
	public void clear() {
		users.clear();
	}
}
