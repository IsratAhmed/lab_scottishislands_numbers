import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        for (String scottishIsland : scottishIslands){
            System.out.println(scottishIsland);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int i = 0; i<numbers.size(); i++){
            if(numbers.get(i) %2==0){
                System.out.println(numbers.get(i));
            }
        }

//        2. Print the difference between the largest and smallest value
        int largest = numbers.get(0);
        int smallest = numbers.get(0);

        for (int i = 0; i< numbers.size(); i++){
            if (numbers.get(i)>largest){
                largest = numbers.get(i);
            } else if (numbers.get(i)<smallest){
                smallest = numbers.get(i);
            }
        }

        System.out.println(largest - smallest);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean number1;
        for (int i = 0; i< numbers.size(); i++){
            if (numbers.get(i)==1 && numbers.get(i+1)==1){
                number1 = true;
            }
        }

    System.out.println(numbers.contains(1));

//        4. Print the sum of the numbers
        int sum = 0;
        for (int value : numbers){
            sum += value;
        }
        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
        int sumNo13 = 0;

        for (int i = 0; i<numbers.size(); i++){
            if(numbers.get(i) != 13){
                sumNo13 += numbers.get(i);
            }
        }

        System.out.println(sumNo13);
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.
        int sumNo13After = 0;

        for (int i = 0; i<numbers.size(); i++){
            if(numbers.get(i) == 13){
                break;

            }
            sumNo13After += numbers.get(i);
        }

        System.out.println(sumNo13After);

    }

}
