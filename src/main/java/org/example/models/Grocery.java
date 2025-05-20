package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir seçim yapın: 0 - 1 - 2");
        int input = scanner.nextInt();
        if (input == 0){

        } else if (input == 1){
            System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
            Scanner scannerAdd = new Scanner(System.in);
            String itemsAdd = scannerAdd.nextLine();
            addItems(itemsAdd);
        } else if (input == 2){
            System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
            Scanner scannerRemove = new Scanner(System.in);
            String itemsRemove = scannerRemove.nextLine();
            removeItems(itemsRemove);
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items){
            if(groceryList.contains(item)) {
                System.out.println("Ürün zaten eklenmiş!");
            } else {
                groceryList.add(item);
                Collections.sort(groceryList);
            }
        }
    }
    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            int index = groceryList.indexOf(item);
            groceryList.remove(item);
            Collections.sort(groceryList);
        }
    }
    public static void checkItemsIsInList(String product) {
        if(groceryList.contains(product)) {
            System.out.println("Bulundu!");
        } else {
            System.out.println("Bulunamadı!");
        }
    }
    public static void printSorted() {
        Collections.sort(groceryList);
        for(String list: groceryList) {
            System.out.println(list);
        }
    }
}
