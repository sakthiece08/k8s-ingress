package com.teqmonic.promotion.controller;

import com.teqmonic.promotion.model.Promotion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PromotionController {

    @GetMapping("/promotions")
    public List<Promotion> getPromotions() {

        return List.of(new Promotion(1, "Promotion-1", 100),
                new Promotion(2, "Promotion-2", 150));
    }
}
