package com.company;

import java.util.Scanner;

public class First {
    Scanner in = new Scanner(System.in);            //Объявление класса сканнер, для возможности ввода данных с клавиатуры
    String[] words =new String[100];
    int n;

    public First(){
        words = new String [2]{"Hello", "world"};                      //Конструктор поумолчанию
        n= 5;
    }

    /*public Second(String str) {
        this.str = str + " ";
        words = longwords();                                    //Конструктор с параметром
        how_words = getHow_words();
        how_much = sentence();
    }

    public Second(Second a){
        this.str=a.str+" ";                                    //Конструктор копирования
        System.out.println(this.str);
    }

    public String getStr(){
        return str;                                     //геттер для строки
    }

    public void setStr(String str){
        this.str=str+" ";                               //Сеттер для строки
    }

    public int getHow_words(){
        return how_words;                              //Геттер для how_words
    }

    public void setHow_words(int how_words){
        this.how_words=how_words;
    }
    public int getHow_much(){
        return how_much;
    }

    public void setHow_much(int how_much){
        this.how_much=how_much;
    }*/

    public void cin(){                              //Метод Ввода
        for(int i =0;i<n;i++)
            words[i]=in.nextLine();            //Ввод массива слов при помощи сканнера
    }

    public void sort(){                            //Метод сортировки
        String cur;                                //Объявление переменной, для временного хранения значеня слова
        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j< n;j++){
                if(words[i].length()>words[j].length()){
                    cur=words[i];
                    words[i]=words[j];
                    words[j]=cur;

                }
            }
        }
    }

    public void show(){                               //Метод вывода
        for(int i =0 ; i<n;i++)
            System.out.println(words[i] + "(" + words[i].length()+")");  //Вывод массива слов + длинна слов
    }
}
