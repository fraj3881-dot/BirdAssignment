import java.util.List;
import java.util.ArrayList;

class Cage<T> {
private T item;

public void setItem(T item) {  
    this.item = item;  
}  

public T getItem() {  
    return item;  
}

}

class Bird {
}

class Canary extends Bird {
}

class Zebra extends Bird {
}

class BirdCage<T extends Bird> extends Cage<T> {
}

public class Main {

public static void addBirds(List<? super Bird> birdList) {  
    birdList.add(new Canary());  
    birdList.add(new Zebra());  
}  

public static void main(String[] args) {  
    List<Bird> myBirds = new ArrayList<>();  
    addBirds(myBirds);  

    BirdCage<Canary> canaryCage = new BirdCage<>();  
    canaryCage.setItem(new Canary());  

    BirdCage<Zebra> zebraCage = new BirdCage<>();  
    zebraCage.setItem(new Zebra());  
}

}
