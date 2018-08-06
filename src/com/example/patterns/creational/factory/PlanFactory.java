package com.example.patterns.creational.factory;

public class PlanFactory {

    Plan getPlan(String type){
        if (type == null){
            return null;
        }

        if(type.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }

        if(type.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }

        if(type.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }

        return null;
    }
}
