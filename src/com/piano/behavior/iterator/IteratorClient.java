package com.piano.behavior.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * 迭代器模式测试客户端
 */
public class IteratorClient {

    public static void main(String[] args) {
        List<Object> products = Arrays.asList("11","22","33","44","55");

        ProductList productList = new ProductList(products);
        AbstractIterator iterator = productList.createIterator();

        System.out.println("正向遍历");
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
        System.out.println("逆向遍历");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
