package com.company.MonthandMath.models;

import java.util.Objects;

public class Month {

    String num;
    String name;

    public Month() {
    }

    public Month(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(num, month.num) && Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

    @Override
    public String toString() {
        return "Month{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
