package com.samsung.model;

import java.util.Arrays;

public class Pet {
    private String petName;
    private String ownerName;
    private String petType;
    private String[] visits;
    private int index;
    public Pet(String petName, String ownerName, String petType) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.petType = petType;
        String[] visits = new String[10];
    }
    public void addVisit(String visit){
        visits[index++]=visit;
        if(index == visits.length()){
            String[] temp = new String[visits.length];
            String visits = new String[visits.length+10];
            for (int i = 0; i < temp.length; i++) {
                visits[i] = temp[i];
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("petName : ").append(petName).append("\n")
                .append("ownerName : ").append(ownerName).append("\n")
                .append("petType : ").append(petType).append("\n");
        return stringBuilder.toString();
    }

}
