package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random r = new Random();


        String[] mas = new String[]
                {"Янгосяров Лев",
                "Рытов Василий",
                "Ясногородский Евгений",
                "Максимов Давид",
                "Наумов Глеб",
                "Набоков Ярослав",
                "Верясов Чеслав",
                "Бельтюков Владлен",
                "Блок Карл",
                "Трактирников Андриян"};


        Student[] arr = new Student[10];
        for (int i = 0; i < mas.length; i++)
        {

            arr[i].setName(mas[r.nextInt(9)+1]);
            arr[i].setPoint( r.nextInt(200) + 1);
        }
        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(arr[i].getName()+ " " + arr[i].getPoint());
        }
       QuickSort.quickSort(arr,0,9);
        System.out.println("\n\n");

        Revers.revers(mas, 10);

        for (int i = 0; i < mas.length; i++)
        {
            System.out.println("Студент " + (i + 1) + " баллы : " + mas[i]);
        }
    }
}
