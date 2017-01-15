package me.maweiyi;

import java.util.HashMap;

/**
 * Created by MWY
 * Date: 1/15/17
 * Time: 20:23
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
