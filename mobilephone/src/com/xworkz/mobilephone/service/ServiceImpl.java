package com.xworkz.mobilephone.service;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.mobilephone.dao.DAO;
import com.xworkz.mobilephone.dao.DAOImpl;
import com.xworkz.mobilephone.dto.DTO;



public class ServiceImpl implements Service {
	public DAO cell;
	
	
	

	public ServiceImpl(DAO cell) {
		System.out.println("Create ServiceImpl");
		this.cell = cell;

	}

	public ServiceImpl() {
	}

	@Override
	public boolean ServiceAndSave(DTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null, will validate fields");
			String brand = dto.getBrand();
			if (brand != null && brand.length() < 10 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}
		}
        
		int prize = dto.getPrize();
		if (validData && prize>0) {
			System.out.println("prize is valid");
			validData = true;
		} else {
			System.out.println("prize is not valid");
			validData = false;
		}
	

		String color = dto.getColor();
		if (validData && color!= null && color.length() >= 3 && !color.isEmpty() && !color.contains(" ") ) {
			System.out.println("color is valid");
			validData = true;
		} else {
			System.out.println("color is not valid");
			validData = false;
		}

		float rating = dto.getRating();
		if (validData && rating>0) {
			System.out.println("rating is valid");
			validData = true;
		} else {
			System.out.println("rating is not valid");
			validData = false;
		}

		int quality = dto.getQuality();
		if (validData && quality>0) {
			System.out.println("quality is valid");
			validData = true;
		} else {
			System.out.println("quality is not valid");
			validData = false;
		}
		
		if(validData) {
			cell.save(dto);
		}
	
		return false;
	}

	@Override
	public boolean validAndupdatePriceAndQuality(int price, int quality, String Brand) {
		System.out.println("Validate update location by name");
		if(price>0 && quality >0 && Brand != null && Brand.length() < 10 && !Brand.isEmpty() && !Brand.contains(" ")) {
			System.out.println("name and location are valid,so update location");
			this.cell.updatePriceAndQuality(price, quality, Brand);
			return true;
	}
	return false;

		
		
	}

	private DTO findByBrand(String brand) {
		System.out.println("invoked findByBrand");
		System.out.println("brand" + brand);
		return this.cell.findByBrand(brand);
		
	}

	@Override
	public void deleteByBrand(String Brand) {
		System.out.println("DeleteByBrand");
		if(Brand !=null && !Brand.isEmpty() && !Brand.contains(" ") && Brand.length()>=3 ) {
			System.out.println("delete");
			this.cell.deleteByBrand(Brand);
				
	}

	}

	@Override
	public List<DTO> getAll() {
		List<DTO>list=cell.getAll();
		System.out.println("getAll:"+list);
		return list;
	}
	
	
	
	
	
	
	}
