package UBER_LLD_CODE.Models;

public class Rider {
    private String name;
    private int rating;

    public Rider(String name,int rating){
        this.name=name;
        this.rating=rating;
    }

    public String getName(){
        return name;
    }
    public int getRating(){
        return rating;
    }
}

