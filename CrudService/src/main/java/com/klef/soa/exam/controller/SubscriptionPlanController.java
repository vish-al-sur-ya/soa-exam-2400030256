package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.SubscriptionPlan;
import com.klef.soa.exam.service.SubscriptionPlanService;

@RestController
public class SubscriptionPlanController {

    private final SubscriptionPlanService service;

    public SubscriptionPlanController(SubscriptionPlanService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "SubscriptionPlan CRUD Service is running";
    }

    @PostMapping("/Add")
    public SubscriptionPlan add(@RequestBody SubscriptionPlan plan) {
        return service.addPlan(plan);
    }

    @GetMapping("/DisplayAll")
    public List<SubscriptionPlan> displayAll() {
        return service.getAllPlans();
    }

    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deletePlan(id);
        return "Subscription plan deleted successfully";
    }
}
