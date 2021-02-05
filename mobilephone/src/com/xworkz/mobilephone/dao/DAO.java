package com.xworkz.mobilephone.dao;

import java.util.List;

import com.xworkz.mobilephone.dto.DTO;


public interface DAO {
	boolean save(DTO dto);

	DTO findByBrand(String brand);

	public boolean updatePriceAndQuality(int price, int quality, String Brand);

	boolean deleteByBrand(String brand);
	List<DTO> getAll();
	
	

}
