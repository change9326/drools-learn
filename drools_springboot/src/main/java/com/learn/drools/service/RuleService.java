package com.learn.drools.service;

import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yujiaqi
 * @date 2020-07-12 21:46
 * @description
 */
@Service
public class RuleService {

    @Autowired
    private KieBase kieBase;

    public void rule(){
        KieSession kieSession = kieBase.newKieSession();
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
