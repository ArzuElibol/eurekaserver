package com.siber.bookclient.Model;

public class Book {

    private String name;
    private String date;
    private String yazar;


    public Book(){


    }

public Book(String name,String date, String yazar){
this.name=name;
this.date=date;
this.yazar=yazar;


}


public String getName() {
    return this.name;
}

public void setName(String name) {
    this.name = name;
}

public String getDate() {
    return this.date;
}

public void setDate(String date) {
    this.date = date;
}

public String getYazar() {
    return this.yazar;
}

public void setYazar(String yazar) {
    this.yazar = yazar;
}
    
    
}
