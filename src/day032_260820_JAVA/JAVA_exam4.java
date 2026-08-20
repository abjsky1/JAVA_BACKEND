package day032_260820_JAVA;

import java.util.ArrayList;
import java.util.List;

public class JAVA_exam4 {

    public static void main(String[] args) {
        
    //  <?> 는 "어떤 타입이든 다 들어올 수 있는 와일드카드(조커) 타입"
        
            List<InventorySlot<?>> inventory = new ArrayList<>();

    //  ? 와일드 카드 타입 사용한 경우

            InventorySlot<String> slot1 = new InventorySlot();
            InventorySlot<Double> slot2 = new InventorySlot();

    //  ? 와일드 카드 타입인 경우 다양한 제네릭타입 받을 수 있다.

            inventory.add(slot1);
            inventory.add(slot2);

    }
}

class InventorySlot<T>{
    private int slotNumber;
    private T data;
} 