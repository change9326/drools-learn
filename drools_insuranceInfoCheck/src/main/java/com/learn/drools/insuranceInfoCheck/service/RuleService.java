package com.learn.drools.insuranceInfoCheck.service;

import com.learn.drools.insuranceInfoCheck.entity.InsuranceInfo;
import com.learn.drools.insuranceInfoCheck.util.KieSessionUtils;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujiaqi
 * @date 2020-07-14 11:34
 * @description
 */
@Service
public class RuleService {

    public List<String> insuranceInfoCheck(InsuranceInfo insuranceInfo) throws
            Exception{
        KieSession session = KieSessionUtils.getKieSessionFromXLS("/Users/jiaqiyu/learn/code/drools-learn/drools_insuranceInfoCheck/rules.xls");
        session.getAgenda().getAgendaGroup("sign").setFocus();
        session.insert(insuranceInfo);
        List<String> listRules = new ArrayList<>();
        session.setGlobal("listRules", listRules);
        session.fireAllRules();

        return listRules;
    }
}
