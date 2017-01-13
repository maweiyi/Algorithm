package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/13/17
 * Time: 19:09
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
