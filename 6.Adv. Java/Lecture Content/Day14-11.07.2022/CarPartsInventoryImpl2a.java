package com.cdac.component;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carParts2a")
public class CarPartsInventoryImpl2a implements CarPartsInventory {

	@Autowired
	private DataSource dataSource;
	
	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		try {
			long ms1 = System.currentTimeMillis();
			conn = dataSource.getConnection();
			long ms2 = System.currentTimeMillis();
			System.out.println("Approx time taken to obtain a connection from the pool : " + (ms2 - ms1) + " ms");
	
			CallableStatement st = conn.prepareCall("{ call add_carpart(?, ?, ?, ?) }");
			st.setString(1, carPart.getPartName());
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());
			st.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}				
	}

	public List<CarPart> getAvailableParts() {
		return null;
	}

	
}
