package com.itdr.basic6;

import java.util.Objects;

/**
 * ClassName: A
 * 日期: 2019/11/29 15:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public class A extends B{
    private String name;
    private int a;

    public void show(){}

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return a == a1.a &&
                Objects.equals(name, a1.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, a);
    }
}
