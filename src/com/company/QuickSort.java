package com.company;

public abstract class QuickSort implements Soreteble{



    public static void quickSort(int[] source, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];

        do {

            while (source[leftMarker] < pivot) {
                leftMarker++;
            }

            while (source[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }

        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

}
