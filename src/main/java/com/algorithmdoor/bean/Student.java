package com.algorithmdoor.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public  class Student {
        private String name;
        private int age;
        private String address;
}