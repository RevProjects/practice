package com.practice.model;

import javax.smartcardio.Card;

//not to go to the database
public class Cards {
    int cardId;
    String name;
    int number;
    int color;
    int shape;
    int fill;

    public Cards(int cardId, String name, int number, int color, int shape,int fill) {
        this.cardId = cardId;
        this.name = name;
        this.number = number;
        this.color = color;
        this.shape = shape;
        this.fill=fill;
    }

    public int getCardId() {
        return cardId;
    }

    public String getCardName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    public int getColor() {
        return color;
    }
    public int getShape() {
        return shape;
    }
    public int getFill() {
        return fill;
    }


}
