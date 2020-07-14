package com.learn.drools.insuranceInfoCheck.controller;

import com.learn.drools.insuranceInfoCheck.entity.Calculation;
import com.learn.drools.insuranceInfoCheck.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yujiaqi
 * @date 2020-07-14 11:36
 * @description
 */
@RestController
@RequestMapping("/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @RequestMapping("/calculate")
    public Calculation calculate(double wage){
        Calculation calculation = new Calculation();
        calculation.setWage(wage);
        calculation = ruleService.calculate(calculation);
        System.out.println(calculation);
        return calculation;
    }
}
