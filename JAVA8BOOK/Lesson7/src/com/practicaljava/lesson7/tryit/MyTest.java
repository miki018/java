package com.practicaljava.lesson7.tryit;
public class MyTest {
    int prvi;

    public int getPrvi() {
        return prvi;
    }

    public void setPrvi(int prvi) {
        this.prvi = prvi;
    }

    public MyTest(int prvi) {
        System.out.println("Mytest pre " + this.prvi);
        this.prvi = prvi;
        System.out.println("Mytest posle" + this.prvi);

    }

}
