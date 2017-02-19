package com.theironyard.charlotte;

public class Attribute {
    String goodName;
    String attributeOne;
    String attributeTwo;
    String attributeThree;
    String attributeFour;
    String attributeFive;

    public Attribute() {
    }

    public Attribute(String goodName, String attributeOne, String attributeTwo, String attributeThree, String attributeFour, String attributeFive) {
        this.goodName = goodName;
        this.attributeOne = attributeOne;
        this.attributeTwo = attributeTwo;
        this.attributeThree = attributeThree;
        this.attributeFour = attributeFour;
        this.attributeFive = attributeFive;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public String getAttributeTwo() {
        return attributeTwo;
    }

    public void setAttributeTwo(String attributeTwo) {
        this.attributeTwo = attributeTwo;
    }

    public String getAttributeThree() {
        return attributeThree;
    }

    public void setAttributeThree(String attributeThree) {
        this.attributeThree = attributeThree;
    }

    public String getAttributeFour() {
        return attributeFour;
    }

    public void setAttributeFour(String attributeFour) {
        this.attributeFour = attributeFour;
    }

    public String getAttributeFive() {
        return attributeFive;
    }

    public void setAttributeFive(String attributeFive) {
        this.attributeFive = attributeFive;
    }

    @Override
    public String toString() {
        return "Name of good: " + goodName + "\nAttribute One: " + attributeOne + "\nAttribute Two: " + attributeTwo + "\nAttribute Three: " + attributeThree + "\nAttribute Four: " + attributeFour+ "\nAttribute Five: " + attributeFive;

    }
}
