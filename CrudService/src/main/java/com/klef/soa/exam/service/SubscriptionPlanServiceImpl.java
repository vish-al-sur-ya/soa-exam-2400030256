package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.SubscriptionPlan;
import com.klef.soa.exam.repository.SubscriptionPlanRepository;

@Service
public class SubscriptionPlanServiceImpl implements SubscriptionPlanService {

    private final SubscriptionPlanRepository repository;

    public SubscriptionPlanServiceImpl(SubscriptionPlanRepository repository) {
        this.repository = repository;
    }

    @Override
    public SubscriptionPlan addPlan(SubscriptionPlan plan) {
        return repository.save(plan);
    }

    @Override
    public List<SubscriptionPlan> getAllPlans() {
        return repository.findAll();
    }

    @Override
    public void deletePlan(Long id) {
        repository.deleteById(id);
    }
}
