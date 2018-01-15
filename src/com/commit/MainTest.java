package com.commit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/1/15.
 */
public class MainTest {
    @Test
    public void main() throws Exception {
        double result = new Discount().getDiscount(new Book("new", 1));
        Assert.assertTrue(result - 1.2 < 0.000000000001);
    }

}