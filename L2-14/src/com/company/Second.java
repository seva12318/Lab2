package com.company;

public class Second {
    private String str;
    private String[] words = new String[100];
    private int how_words=0, how_much=0;

    public Second(){
        str="Hello world. I miss you.";                        //Конструктор поумолчанию
        how_much =2;
        how_words= 5;
    }

    public Second(String str) {
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
    }

    /*public String[] delwords(){
        String s = getStr();
        words = s.split("[. ]");
        return words;}*/

    public String[] longwords(){
        String s = getStr();
        words = s.split("[. ]+");
        setHow_words(this.words.length);
        return words;
    }

    public void sort(){
        String cur;
        for(int i = 0; i<how_words-1;i++){
            for(int j = i+1; j< how_words;j++){
                if(words[i].length()>words[j].length()){
                    cur=words[i];
                    words[i]=words[j];
                    words[j]=cur;

                }
            }
        }
    }
    public int sentence(){
        int before=0, after=0;
        String str = getStr();
        before=str.length();
        str=str.replaceAll("\\.", "");
        after=str.length();
        setHow_much(before-after);
        return before-after;
    }

    public void show(){
        String str="";
        for(int i =0;i<how_words;i++){
            str+=words[i]+ " ";
        }
        System.out.println(str);
        System.out.println(how_much);
    }
}