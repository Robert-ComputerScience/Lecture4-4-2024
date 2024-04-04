package org.example;

public class MyArrayList implements mylist
{

    int cap =4;
    int size = 0;
    int [] arr = new int[cap];

    @Override
    public boolean add(int x) {
        if(size()==cap) {
            changeCap();
        }
        arr[size++] = x;
        return true;


    }

    private void changeCap()
    {
        int [] arr2 = new int[cap*2];
        for(int i =0; i<cap; i++)
        {
            arr2[i]=arr[i];
            cap=cap*2;
            arr=arr2;

        }

    }

    @Override
    public int size() {
        return arr[size];
    }

    @Override
    public int get(int index) {

        return arr[index];
    }

    @Override
    public int search(int x) {
        return 0;
    }

    @Override
    public boolean remove(int x) {
        return false;
    }

    @Override
    public void insert(int x, int index) {

    }
}
