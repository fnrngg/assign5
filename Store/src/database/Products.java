package database;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Products {

	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Map<String, Item> getAll() {
		MyDb db = new MyDb();
		Connection con = db.connect();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products");
			while(rs.next()) {
				Item newItem = new Item(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				items.put(rs.getString(1), newItem);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}
	
	public Item getItem(String productId) {
		if(items.containsKey(productId)) {
			return items.get(productId);
		} else {
			return null;
		}
	}
}
