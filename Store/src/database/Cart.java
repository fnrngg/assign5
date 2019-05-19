package database;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {
	private Map<String, Integer> chosens;
	
	public Cart() {
		chosens = new HashMap<String, Integer>();
	}
	
	public void addItem(String productId, int number) {
		chosens.put(productId, number);
	}
	
	public int numberOf(String productId) {
		if(chosens.containsKey(productId)) {
			return chosens.get(productId);
		} else {
			return -1;
		}
	}
	
	public Map<String, Integer> getFullCart() {
		return chosens;
	}
	
	public void remove(String id) {
		chosens.remove(id);
	}

	public boolean contains(String productId) {
		return chosens.containsKey(productId);
	}
	
}
