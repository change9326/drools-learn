package com.learn.drools.creditCardApply.service;

import com.learn.drools.creditCardApply.entity.Calculation;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yujiaqi
 * @date 2020-07-14 11:34
 * @description
 */
@Service
public class RuleService {

    @Autowired
    private KieBase kieBase;

    public Calculation calculate(Calculation calculation){
        KieSession kieSession = kieBase.newKieSession();
        kieSession.insert(calculation);
        kieSession.fireAllRules();
        kieSession.dispose();
        return calculation;
    }
}
