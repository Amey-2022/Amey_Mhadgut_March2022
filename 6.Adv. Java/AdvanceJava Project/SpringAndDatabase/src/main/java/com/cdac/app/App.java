package com.cdac.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarPart;
import com.cdac.component.CarPartsInventory;




public class App {
	
	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		//model/entity classes are not instantiated using Spring
		CarPartsInventory inv=(CarPartsInventory) ctx.getBean("carParts3");
		/*CarPart cp=new CarPart();
		cp.setPartName("clutch plate");
		cp.setCarModel("Maruti 800");
		cp.setPrice(2500);
		cp.setQuantity(50);
		
		long ms1=System.currentTimeMillis();
		inv.addNewPart(cp);
		long ms2=System.currentTimeMillis();
		System.out.println("Total Time Taken: "+ (ms2-ms1) +" ms approx.");*/
		
		List<CarPart> list= inv.getAvailableParts();
		for(CarPart carPart: list)
			System.out.println(carPart);
	}
}
