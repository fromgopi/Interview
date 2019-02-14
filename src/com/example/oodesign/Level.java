package com.example.oodesign;

public class Level {

    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;	//number of free spots
    private static final int SPOT_PER_ROW = 10;

    public Level(int floor, int numberSpots) {
        this.floor = floor;
        this.availableSpots = numberSpots;
        spots = new ParkingSpot[availableSpots];
        int largeSpots = numberSpots / 4;
        int bikeSpots = numberSpots / 4;
        int compactSpots = numberSpots - largeSpots - bikeSpots;

        for (int i = 0; i < numberSpots; i++){
            VehicleSize sz = VehicleSize.Motorcycle;
            if (i < largeSpots + compactSpots){
                sz = VehicleSize.CarSize;
            }
        }
    }
}
