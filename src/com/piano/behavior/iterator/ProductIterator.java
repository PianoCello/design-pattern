package com.piano.behavior.iterator;

import java.util.List;

/**
 * 具体迭代器
 */
public class ProductIterator implements AbstractIterator {

    private List<Object> products;
    //记录正向遍历的游标
    private int cursor;
    //记录逆向遍历的游标
    private int cursor2;

    public ProductIterator(ProductList productList) {
        //获取集合对象
        this.products = productList.getObjects();
        //设置正向遍历游标的初始值
        this.cursor = 0;
        //设置逆向遍历游标的初始值
        this.cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor < products.size()) {
            cursor++;
        }
    }

    @Override
    public boolean isLast() {
        return cursor == products.size();
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
