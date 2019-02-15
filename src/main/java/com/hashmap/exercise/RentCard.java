package com.hashmap.exercise;

import java.util.HashMap;
import java.util.Map;


public class RentCard {
    Map<Choice , Integer> rentCard;
    public RentCard(){
        rentCard = new HashMap<Choice, Integer>();
    }
    public Map createRentCard(Price price){
        rentCard.put(new Choice(Sharing.ONE, Food.WITH_FOOD), price.getOneSharingWithFood());
        rentCard.put(new Choice(Sharing.ONE, Food.WITHOUT_FOOD), price.getOneSharingWithFood()-1000);
        rentCard.put(new Choice(Sharing.TWO, Food.WITH_FOOD), price.getTwoSharingWithFood());
        rentCard.put(new Choice(Sharing.TWO, Food.WITHOUT_FOOD), price.getTwoSharingWithFood()-1000);
        rentCard.put(new Choice(Sharing.THREE, Food.WITH_FOOD), price.getThreeSharingWithFood());
        rentCard.put(new Choice(Sharing.THREE, Food.WITHOUT_FOOD), price.getThreeSharingWithFood()-1000);

        return rentCard;
    }
}
