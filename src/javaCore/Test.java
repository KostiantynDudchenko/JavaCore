package javaCore;

import javaCore.t5t4t7.Animal;

import java.io.*;
import java.util.*;

public class Test {


    public static void main(String[] args) throws IOException {

        Map<String, List<String>>  map= new HashMap<>();

        map.put("Katia", new ArrayList<>(Arrays.asList("Dudchenko", "Tkach")));
        map.get("Katia").add("Baluta");

        map.get("Katia").stream().forEach(System.out::println);

    }


}

