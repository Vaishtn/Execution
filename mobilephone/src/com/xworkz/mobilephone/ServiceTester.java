package com.xworkz.mobilephone;

import com.xworkz.mobilephone.dao.DAO;
import com.xworkz.mobilephone.dao.DAOImpl;
import com.xworkz.mobilephone.dto.DTO;
import com.xworkz.mobilephone.service.Service;
import com.xworkz.mobilephone.service.ServiceImpl;

public class ServiceTester {

	public static void main(String[] args) {
			DTO dto2=new DTO();
			dto2.setBrand("1+");
			dto2.setColor("white");
			dto2.setPrize(100000);
			dto2.setQuality(5);
			dto2.setRating(4.5f); 
			
			
			DAO dao=new DAOImpl();
			
			Service service=new ServiceImpl(dao);
			service.ServiceAndSave(dto2);
			
			service.validAndupdatePriceAndQuality(20000, 5, "phone");
			
			service.getAll();
			
			service.deleteByBrand("1+");
			
	}

}
