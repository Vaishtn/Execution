package com.xworkz.mobilephone.dto;

public class DTO {
	private int prize;
	private String brand;
	private String color;
	private float rating;
	private int quality;

	public DTO() {
		// TODO Auto-generated constructor stub
	}

	public DTO(int prize, String brand, String color, float rating, int quality) {
		super();
		this.prize = prize;
		this.brand = brand;
		this.color = color;
		this.rating = rating;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "DTO [prize=" + prize + ", brand=" + brand + ", color=" + color + ", rating=" + rating + ", quality="
				+ quality + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("obj is null");
			return false;
		}
		if (obj instanceof DTO) {
			DTO convert = (DTO) obj;

			if (this.brand != null && this.color != null) {
				if (this.brand.equals(convert.getBrand()) && this.color.equals(convert.getColor())) {
					System.out.println("brand and type is matching" + convert.brand);
					return true;
					}
				return false;
			}
		}
		return false;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

}
