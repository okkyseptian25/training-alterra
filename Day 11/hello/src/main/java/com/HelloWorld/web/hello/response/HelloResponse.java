package com.HelloWorld.web.hello.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloResponse {
    private String name;
    private String id;
}
