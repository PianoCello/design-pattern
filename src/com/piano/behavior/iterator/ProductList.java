package com.piano.behavior.iterator;

import java.util.List;

/**
 * 具体聚合类
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
