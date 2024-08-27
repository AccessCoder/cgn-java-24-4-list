package de.neuefische;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] ints = new int[2];
        int[] ints2 = {1,2,3};

        //Wrapper Klassen
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3)); //-> new Integer[0]

        //Add Data
        integers.add(1); // -> new Integer[1], Integer[0]=1;
        integers.add(5);
        integers.add(3);

        //Remove Data
        integers.remove(Integer.valueOf(5));

        //Add on Spot
        integers.add(2, 100);

        //Size of List
        int size = integers.size();

        //Get Data
        Integer x = integers.get(2);

        for (int i = 0;i<integers.size(); i++){
            //Durch i wachsender indexinteger möglich um z. B. Daten zu laden
            System.out.println(integers.get(i));
        }

        //Vorüberg. Variable : Sammlung die durchsucht wird
        for (Integer currywurst:integers) {
            System.out.println(currywurst);
        }

        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        Person person2 = new Person();
        personList.add(person);
        personList.add(person2);

        personList.get(0).sayHello();


    }
}