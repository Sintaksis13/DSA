package com.epam.task1_2;

import java.util.Arrays;

public class DynamicDoubleArray {
    private double[] array;
    private int arraySize = -1;

    public DynamicDoubleArray(int initialSize) {
        this.array = new double[initialSize];
    }

    public void add(double elem) {
        arraySize++;
        if (arraySize == array.length) {
            increaseArrayLength();
        }

        array[arraySize] = elem;
    }

    public double get(int index) {
        checkIndexError(index);

        return array[index];
    }

    public void remove(int index) {
        checkIndexError(index);

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        if (array.length - arraySize <= 1) {
            decreaseArrayLength();
        }

        arraySize--;
    }

    private void checkIndexError(int index) {
        if (index > arraySize || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in array!");
        }
    }

    private void increaseArrayLength() {
        double[] newArray = new double[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private void decreaseArrayLength() {
        double[] newArray = new double[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        DynamicDoubleArray d = new DynamicDoubleArray(10);

        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }
    }
}
