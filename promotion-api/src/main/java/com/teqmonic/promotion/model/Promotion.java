package com.teqmonic.promotion.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Promotion {

    private int id;

    private String name;

    private int productId;

}
