package com.learn.drools.insuranceInfoCheck.service;

import com.learn.drools.insuranceInfoCheck.entity.CreditCardApplyInfo;
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

    public CreditCardApplyInfo creditCardApply(CreditCardApplyInfo
                                                       creditCardApplyInfo){
        KieSession session = kieBase.newKieSession();
        session.insert(creditCardApplyInfo);
        session.fireAllRules();
        session.dispose();
        return creditCardApplyInfo;
    }
}
