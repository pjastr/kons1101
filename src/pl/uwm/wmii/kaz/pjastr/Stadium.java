package pl.uwm.wmii.kaz.pjastr;

import java.util.Objects;

public class Stadium extends Court{

    public Stadium(double width, double length, String address, int year_built, String name, String common_name, int capacity) {
        super(width, length, address, year_built);
        this.name = name;
        this.common_name = common_name;
        if (capacity<0)
        {
            capacity=0;
        }
        this.capacity = capacity;
    }

    public Stadium(double width, double length, String address, int year_built, String name, int capacity) {
        super(width, length, address, year_built);
        this.name = name;
        this.common_name = "";
        if (capacity<0)
        {
            capacity=0;
        }
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getCommon_name() {
        return common_name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public void setCapacity(int capacity) {
        if (capacity >=0)
            this.capacity = capacity;
    }

    @Override
    public String toString()
    {
        if (this.common_name.compareTo("") ==0)
        {
            return super.toString()+"Nazwa: "+this.name+".\n" +
                    "Pojemność stadionu: "+this.capacity+" osób.";
        }
        else
        {
            return super.toString()+"Nazwa: "+this.name+".\n" +"Nazwa zwyczajowa: "+this.common_name+".\n"+
                    "Pojemność stadionu: "+this.capacity+" osób.";
        }
    }

    private String name;
    private String common_name;
    private int capacity;
}
