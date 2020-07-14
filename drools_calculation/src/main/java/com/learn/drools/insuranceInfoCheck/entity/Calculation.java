package com.learn.drools.insuranceInfoCheck.entity;

/**
 * @author yujiaqi
 * @date 2020-07-14 11:09
 * @description
 */
public class Calculation {
    private double wage;//税前⼯资
    private double wagemore;//应纳税所得额
    private double cess;//税率
    private double preminus;//速算扣除数
    private double wageminus;//扣税额
    private double actualwage;//税后⼯资

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWagemore() {
        return wagemore;
    }

    public void setWagemore(double wagemore) {
        this.wagemore = wagemore;
    }

    public double getCess() {
        return cess;
    }

    public void setCess(double cess) {
        this.cess = cess;
    }

    public double getPreminus() {
        return preminus;
    }

    public void setPreminus(double preminus) {
        this.preminus = preminus;
    }

    public double getWageminus() {
        return wageminus;
    }

    public void setWageminus(double wageminus) {
        this.wageminus = wageminus;
    }

    public double getActualwage() {
        return actualwage;
    }

    public void setActualwage(double actualwage) {
        this.actualwage = actualwage;
    }
}
