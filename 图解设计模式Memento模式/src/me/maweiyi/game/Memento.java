package me.maweiyi.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MWY
 * Date: 2/5/17
 * Time: 21:13
 */
public class Memento {
    int money;
    ArrayList fruits;
    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List)fruits.clone();
    }
}
