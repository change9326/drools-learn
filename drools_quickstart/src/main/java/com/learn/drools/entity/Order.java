package com.learn.drools.entity;

/**
 * @author yujiaqi
 * @date 2020-07-12 09:43
 * @description
 */
public class Order {

    /**
     * 订单原始价格，即优惠前价格
     */
    private Double originalPrice;
    /**
     * 订单真实价格，即优惠后价格
     */
    private Double realPrice;

    @Override
    public String toString() {
        return "Order{" +
                "originalPrice=" + originalPrice +
                ", realPrice=" + realPrice +
                '}';
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }
}
