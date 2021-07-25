package com.hdecoded;

public class Array {

    private int[] items;
    private int counter = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if(items.length == counter){
            int newItems[] = new int[2 * counter];

            for (int i = 0;i < counter; i++){
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[counter] = item;
        counter++;
    }

    public void print() {
        for (int i = 0 ; i < counter ; i ++) {
            System.out.println(items[i]);
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= counter){
            throw new IllegalArgumentException();
        }

        for( int i = index ; i < counter; i++) {
            items[i] = items[i + 1];

            counter--;
        }
    }

    public int indexOf(int number) {
        int index = 0;

        for (int i = 0 ; i < counter ; i ++) {
            if(number == items[i]){
               return index;
            }
        }
        return -1;
    }
}
