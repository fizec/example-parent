package com.solut.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Person {
    private String name;
    private String secondName;
    private String age;

}
