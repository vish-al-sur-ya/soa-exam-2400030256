package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.SubscriptionPlan;

public interface SubscriptionPlanService {
    SubscriptionPlan addPlan(SubscriptionPlan plan);
    List<SubscriptionPlan> getAllPlans();
    void deletePlan(Long id);
}
