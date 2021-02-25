package com.baba.advanced_class_design.nested;

public class AnonInner {

    interface Sale {
        int dollarsOff();
    }

    private int admission(int basePrice) {
        Sale sale = new Sale() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };

        return basePrice - sale.dollarsOff();
    }




    private int pay() {
        return add(new Sale() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    private int payWithLambda() {
        return add(() -> 3);
    }

    private int add(Sale sale) {
        return 5 - sale.dollarsOff();
    }

    public static void main(String[] args) {
        System.out.println(new AnonInner().payWithLambda());
    }
}
