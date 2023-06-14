package methodsjava.generic;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add("joy");
        items.add(3);
        items.add(4);

        printDoubled(items);

    }
    public static void printDoubled(ArrayList n){
        for (Object i: n){
            System.out.println((Integer) i * 2);
        }
    }
}
