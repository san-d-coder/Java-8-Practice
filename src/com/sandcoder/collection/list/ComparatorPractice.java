package com.sandcoder.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {

	public static void main(String[] args) {
		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile("Apple",4,59999,3));
		mobiles.add(new Mobile("Samsung",16,79999,5));
		mobiles.add(new Mobile("Redmi",12,12000,5));
		mobiles.add(new Mobile("Jio",2,2000,2));
		
		System.out.println("Before Sorting: ");
		for (Mobile mobile : mobiles)
			System.out.println(mobile);

		
		Collections.sort(mobiles, new Comparator<Mobile>() {

			@Override
			public int compare(Mobile m1, Mobile m2) {
//				if(m1.getPrice()>m2.getPrice())
//					return 1;
//				else if(m1.getPrice()<m2.getPrice())
//					return -1;
//				else
//					return 0;
				return (int) (m1.getPrice() - m2.getPrice());
			}
		});
		
		System.out.println("After Sorting: ");
		for (Mobile mobile : mobiles)
			System.out.println(mobile);
	}

}

class Mobile{
	private String brand;
	private int ram;
	private float price;
	private int cameras;
	
	public Mobile(String brand, int ram, float price, int cameras) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.cameras = cameras;
	}

	public String getBrand() {
		return brand;
	}

	public int getRam() {
		return ram;
	}

	public float getPrice() {
		return price;
	}

	public int getCameras() {
		return cameras;
	}

	@Override
	public String toString() {
		return "Mobiles [brand=" + brand + ", ram=" + ram + ", price=" + price + ", cameras=" + cameras + "]";
	}
}
