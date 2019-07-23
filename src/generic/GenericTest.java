package generic;

import java.util.HashSet;

public class GenericTest<T> {

    private T x;
    private T y;

    public GenericTest(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public static void main(String[] args) {

        //类后面给定
        GenericTest<String> test = new GenericTest<>("X","Y");
        test.getX();
        test.getY();
    }

}
