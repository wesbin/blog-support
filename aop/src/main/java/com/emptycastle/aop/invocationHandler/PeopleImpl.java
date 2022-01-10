package com.emptycastle.aop.invocationHandler;

public class PeopleImpl implements People{

    static private int count = 0;
    private int stamina = 100;
    private int intellect = 50;

    @Override
    public void talking(String sentence) {
        System.out.println(">>> talking start");
        if (stamina < 0) {
            System.out.println("not enough stamina");
        } else {
            System.out.println(sentence);
            minusStamina(10);
            ++count;
        }
    }

    @Override
    public void eating(String food) {
        System.out.println(">>> eating start");
        System.out.println("eat : " + food);
        addStamina(10);
        count++;
    }

    @Override
    public void studying(String subject) {
        System.out.println(">>>studying start");
        if (stamina < 0) {
            System.out.println("not enough stamina");
        } else {
            System.out.println("studying " + subject);
            minusStamina(20);
            addIntellect(10);
            ++count;
        }
    }

    @Override
    public void nowState() {
        System.out.println("stamina : " + stamina + " | intellect : " + intellect);
    }

    public void readCount() {
        System.out.println("act count : " + count);
    }

    private void addStamina(int value) {
        stamina += value;
    }

    private void minusStamina(int value) {
        stamina -= value;
    }

    private void addIntellect(int value) {
        intellect += value;
    }
}