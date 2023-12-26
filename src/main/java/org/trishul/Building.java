package org.trishul;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String buildingName;
    List<Floor> floors;

    public Building(String name){
        this.buildingName = name;
        floors = new ArrayList<>();
    }

    public String getBuildingName(){
        return this.buildingName;
    }

    public void addFloor(Floor floor){
        this.floors.add(floor);
        System.out.println("Floor added successfully "+ floor.getFloorName());
    }

    public void deleteFloor(Floor floor){
        if(floors.contains(floor)){
            floors.remove(floor);
            System.out.println("Floor removed successfully "+ floor.getFloorName());
        }
        else{
            System.out.println("Floor not found");
        }
    }


}
