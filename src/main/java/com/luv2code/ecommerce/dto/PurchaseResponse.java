package com.luv2code.ecommerce.dto;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class PurchaseResponse {

    @NonNull
    private String orderTrackingNumber;
}
