//Create a list of 10 Integer objects and process the list element by element to count
//objects containing even value. Print the total number of odd objects after counting even objects.

import java.util.ArrayList;
import java.util.List;

public class DemoGenricArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);



        int count2 = 0;
        int count = 0;
        for(Integer element:integerList)
            if (element % 2 ==0){
                count++;
        } else {
         count2++;
            }
        System.out.println("Count of Even object" + count);
        System.out.println("Count of Odd object" + count2);

    }
}
