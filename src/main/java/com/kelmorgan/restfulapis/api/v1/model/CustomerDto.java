package com.kelmorgan.restfulapis.api.v1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
}
