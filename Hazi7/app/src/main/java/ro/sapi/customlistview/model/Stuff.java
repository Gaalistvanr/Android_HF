package ro.sapi.customlistview.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ro.sapi.customlistview.R;

public class Stuff implements Serializable {
    private String name;
    private String info;
    private int img;

    public Stuff(String name, String info, int img) {
        this.name = name;
        this.info = info;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getImg() {
        return img;
    }
    public static List<Stuff> getStuff()
    {
        List<Stuff> stufflist = new ArrayList<>();
        stufflist.add(new Stuff("Octopus",  "8 tentacled monster", R.drawable.cat));
        stufflist.add(new Stuff("Pig", "Delicious in rolls", R.drawable.disznyo));
        stufflist.add(new Stuff("Sheep", "Great for jumpers", R.drawable.dog));
        stufflist.add(new Stuff("Rabbit","Nice in a stew", R.drawable.giraffe));
        stufflist.add(new Stuff("Snake",  "Great for shoes", R.drawable.horse));
        stufflist.add(new Stuff("Spider", "Scary", R.drawable.lion));
        stufflist.add(new Stuff("Spider", "Scary", R.drawable.octopus3));
        stufflist.add(new Stuff("Spider", "Scary", R.drawable.rabbit));
        stufflist.add(new Stuff("Spider", "Scary", R.drawable.sheep));
        return stufflist;

    }

}
