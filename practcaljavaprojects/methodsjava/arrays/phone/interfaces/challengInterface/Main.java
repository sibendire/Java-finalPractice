package arrays.phone.interfaces.challengInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player theplayer = new  Player("Needs corrections",0,0);
        System.out.println( theplayer.getName());
        System.out.println(theplayer.getHintPoint());
        System.out.println(theplayer.getStrength());
        System.out.println(  theplayer.getWeapon());

        theplayer = new Player("sam",1,3);

    }
    public static ArrayList<String>readValues() {
        ArrayList<String> value = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("choose\n" + "to enter a string\n" + "0 to quit");
        while (!quit) {
            System.out.println("choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    value.add(index, stringInput);
                    index++;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        return value;
    }

      public static void saveObject(ISaveable objectToSave){
          for (int i = 0; i < objectToSave.write().size(); i ++){
              System.out.println("saved"+ objectToSave.write().get(i));
          }

        }
        public static void readObject(ISaveable objectToRead){
        for (int i = 0; i < objectToRead.write().size();i++){
            System.out.println("welcome" + objectToRead.write().get(i));
        }
        }

}
