package me.maweiyi;

import me.maweiyi.Product;

/**
 * Created by MWY
 * Date: 1/13/17
 * Time: 19:12
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
