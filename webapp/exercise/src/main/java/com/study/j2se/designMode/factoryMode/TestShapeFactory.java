package com.study.j2se.designMode.factoryMode;

/**
 * Created by Administrator on 2018/1/6.
 */
public class TestShapeFactory {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        Shape Square = ShapeFactory.getShape("Square");
        circle.draw();
        Square.draw();
    }
}
