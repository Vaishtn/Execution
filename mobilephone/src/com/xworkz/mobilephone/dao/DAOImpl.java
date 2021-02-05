package com.xworkz.mobilephone.dao;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

import com.xworkz.mobilephone.dto.DTO;

public class DAOImpl implements DAO {
	private List<DTO> mobile = new ArrayList<DTO>();

	public DAOImpl(List<DTO> list) {
		this.mobile = list;
		System.out.println("Created DAOImpl");

	}

	public DAOImpl() {
		
	}
	
	@Override
	public boolean save(DTO dto) {
		System.out.println("invoked save method");
		System.out.println("invoked to dto" + dto);
		boolean added = false;
		boolean contains = this.mobile.contains(dto);
		if (!contains) {
			added = this.mobile.add(dto);
		}

		if (added) {
			System.out.println("phone added");

		} else {
			System.out.println("phone not added");
		}

		return added;
	}

	@Override
	public DTO findByBrand(String brand) {
		System.out.println("findByBrand");
		System.out.println("brand"+brand);
		for (DTO dto : this.mobile) {
			String brandFromDTO=dto.getBrand();
			if(brandFromDTO.equals(brand)) {
				System.out.println("brand found");
				return dto;
			}
			
			
		}
		return null;
	}

	@Override
	public boolean updatePriceAndQuality(int price, int quality, String Brand) {
		System.out.println("invoked updatePriceAndQuantity");
		System.out.println("prize " + price);
		System.out.println("type " + quality);
		System.out.println("brand " + Brand);
		DTO phone1 = this.findByBrand(Brand);
		if (phone1 != null) {
			System.out.println("can update,price found");
			phone1.setQuality(quality);
			phone1.setBrand(Brand);
			return true;
		} else {
			System.out.println("can update,price not found");
		}
		
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		DTO dto = this.findByBrand(brand);
		ListIterator<DTO> list=this.mobile.listIterator();
		while (list.hasNext()) {
			DTO dto1=list.next();
			if(dto1.getBrand().equals(brand)) {
				list.remove();
				System.out.println("brand is deleted");
		
		return true;
	}

}
		System.out.println("brand is not deleted");
		return false;
	}

	@Override
	public List<DTO> getAll() {
		return this.mobile;
	}
}

