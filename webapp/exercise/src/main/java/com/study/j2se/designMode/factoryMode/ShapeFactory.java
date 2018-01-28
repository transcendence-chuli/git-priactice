package com.study.j2se.designMode.factoryMode;

import com.sun.istack.internal.Nullable;

/**
 * Created by Administrator on 2018/1/6.
 */
public class ShapeFactory {
    public static Shape getShape(@Nullable String clazz){
        Shape shape = null;
        if("circle".equalsIgnoreCase(clazz)){
            shape = new Circle();
        }
        if("Square".equalsIgnoreCase(clazz)){
            shape = new Square();
        }
        return shape;
    }
}
