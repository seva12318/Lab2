package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //Объявления сканера для чтения данных введённых с клавиатуры


        //Задание № 1
	    System.out.println("Введите количество слов в массиве: ");
	    int n = Integer.parseInt(in.nextLine()); //Ввод количества слов в массиве
        First Massive = new First(n);            //Объявление класса для задания № 1
	    Massive.cin();                           //Вызов метода ввода массива слов
	    Massive.sort();                          //Вызов метода, который производит сортировку, массива слов
	    Massive.show();                          //Вызов метода вывода массива слов

	    //Задание № 2 и 3
        System.out.println("Введите строку:");
        String str= in.nextLine();                     //Ввод строки
	    Second stroka = new Second(str);               //Объявление класса для задания № 2 и 3
        //Second stroka = new Second();                //Конструктор по умолчанию
        //Second stroka2 = new Second(stroka);         //Конструктор копирования
        stroka.longwords();                           //Вызов метода, который считает количество слов в строке
        stroka.sentence();                            //Вызов метода, который делит строку на массив слов
        stroka.sort();                                //Вызов метода, который производит сортировку, массива слов
        stroka.show();                                //Вызов метода вывода строки


    }
}
