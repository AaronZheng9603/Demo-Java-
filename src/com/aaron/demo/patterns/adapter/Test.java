package com.aaron.demo.patterns.adapter;

import com.aaron.demo.patterns.adapter.class_adapter.Adapter1;
import com.aaron.demo.patterns.adapter.class_adapter.Targetable1;
import com.aaron.demo.patterns.adapter.interface_adapter.Sub1;
import com.aaron.demo.patterns.adapter.interface_adapter.Sub2;
import com.aaron.demo.patterns.adapter.interface_adapter.Targetable3;
import com.aaron.demo.patterns.adapter.object_adapter.Adaptee2;
import com.aaron.demo.patterns.adapter.object_adapter.Adapter2;
import com.aaron.demo.patterns.adapter.object_adapter.Targetable2;

public class Test {

    public static void main(String[] args) {
        Targetable1 targetable1 = new Adapter1();
        targetable1.method1();
        targetable1.method2();
        System.out.println("-----------------------------");

        Targetable2 targetable2 = new Adapter2(new Adaptee2());
        targetable2.method1();
        targetable2.method2();
        System.out.println("-----------------------------");

        Targetable3 tar1 = new Sub1();
        Targetable3 tar2 = new Sub2();
        tar1.method1();
        tar2.method2();
    }
}
