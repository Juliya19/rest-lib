package entity;

import java.io.Serializable;

public class Point implements Serializable{

    private int a;
    private int b;

    public Point(){

    }

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (getA() != point.getA()) return false;
        return getB() == point.getB();
    }

    @Override
    public int hashCode() {
        int result = getA();
        result = 31 * result + getB();
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
