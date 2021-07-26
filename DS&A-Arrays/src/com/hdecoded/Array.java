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
        }
        counter--;
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

    public int max (){
        int max = items[0];
        for(int i = 0; i < counter ;i++){
            if(max < items[i]){
                max = items[i];
            }
        }
        return max;
    }

    public Array intersect(Array array){
        Array intersect = new Array(4);
        for (int i = 0  ; i < array.counter; i++){
            for( int j = 0 ; j < this.counter; j++ ){
                if(this.items[j] == array.items[i]){
                    intersect.insert(this.items[j]);
                }
            }
        }
        return intersect;
    }

    public Array reverse() {
        Array reverse = new Array(1);

        for (int i = counter; i > 0 ; i--){
            reverse.insert(items[i-1]);
        }

        return reverse;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index >= counter){
            throw new IllegalArgumentException();
        }
        counter++;
        for( int i = counter ; i > index; i--) {
            items[i-1] = items[i-2];
        }
        items[index] = item;
    }
}
