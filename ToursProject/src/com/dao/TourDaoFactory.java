package com.dao;

public class TourDaoFactory {

	private static TourDaoFactory tourFactory = null;
	
	private TourDaoFactory() {
	}
	
	public static TourDaoFactory getTourFactoryInstance() {
		if(tourFactory == null) {
			tourFactory = new TourDaoFactory();
		}
		
		return tourFactory;
	}
	
	public TourData getTourStorage(String storageMedium) {
		TourData tourData = null;
		
		if("Collection".equals(storageMedium)) {
			tourData = null;
		} else if("Oracle".equals(storageMedium)) {
			tourData = new TourDataOracle();
		} else if("MySQL".equals(storageMedium)) {
			tourData = null;
		}
		
		return tourData;
	}

	
}
