package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }



    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == null || value.isEmpty()) {
            return "Data not available";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public JobField() {
//        id = nextId;
//        nextId++;
//    }
//
//    public JobField(String value) {
//        this();
//        this.value = value;
//    }
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(getId());
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        if(value == null || value == ""){
//            return "Data not available";
//        }else {
//            return value;
//        }
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}