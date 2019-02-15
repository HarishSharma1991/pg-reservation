package com.hashmap.exercise;


import lombok.Data;


public class Choice {
    private  Sharing sharing;
    private Food food ;
    public Choice(Sharing sharing , Food food){
        this.sharing = sharing;
        this.food = food;
    }

    @Override
    public boolean equals(Object choiceObject)
    {
        if(this == choiceObject)
            return true;
        if(choiceObject == null || choiceObject.getClass()!= this.getClass())
            return false;
        Choice choice = (Choice) choiceObject;
        return (choice.sharing == this.sharing && choice.food == this.food);
    }

    @Override
    public int hashCode() {
        return sharing.toString().length();
    }
}
