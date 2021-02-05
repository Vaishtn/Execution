package com.xworkz.mobilephone;

import com.xworkz.mobilephone.dao.DAO;
import com.xworkz.mobilephone.dao.DAOImpl;
import com.xworkz.mobilephone.dto.DTO;

public class Tester {

	public static void main(String[] args) {
		
		DTO phone=new DTO();
		phone.setBrand("Nokia");
		phone.setColor("blue");
		phone.setPrize(5000);
		phone.setQuality(2);
		phone.setRating(3.5f);
		
		DAO dao=new DAOImpl();
		dao.save(phone);
		
		DTO dto=new DTO(600,"Asus","black",4.5f,3);
		dao.save(dto);
		
		System.out.println("*******");
		
		DTO dtoFound=new DTO();
		dao.findByBrand("Nokia");
		
		System.out.println("*******");
		
		DTO update=new DTO();
		dao.updatePriceAndQuality(6000, 6, "Mi");
		
		System.out.println("*********");
		
		System.out.println(dao.getAll());
		
		
//		DTO delete=new DTO();
//		dao.deleteByBrand("Nokia");
//		
		
		
	}
}
