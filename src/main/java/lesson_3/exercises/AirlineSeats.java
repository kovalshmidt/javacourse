package lesson_3.exercises;

import java.security.PublicKey;

public class AirlineSeats {
    private String planeClass;
    private boolean reserved;

    public AirlineSeats(String planeClass,boolean reserved){
        this.planeClass = planeClass;
        this.reserved = reserved;
    }
    public AirlineSeats(){
        this.planeClass = "First";
        this.reserved = false;
    }
}
