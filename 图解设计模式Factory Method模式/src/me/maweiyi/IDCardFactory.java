package me.maweiyi;

import me.maweiyi.Factory;
import me.maweiyi.IDCard;
import me.maweiyi.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MWY
 * Date: 1/13/17
 * Time: 19:21
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
