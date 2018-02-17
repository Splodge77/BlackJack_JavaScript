package example.codeclan.com.blackjack;

/**
 * Created by user on 25/01/2018.
 */

public enum CardName {
    ACE(11),
    KING(10),
    QUEEN(10),
    JACK(10),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2);

    private int value;

    CardName(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public int setValue(int newValue){
        return this.value = newValue;
    }
}
