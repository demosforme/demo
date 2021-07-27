package com.example.demo.models;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Accessors(chain = true)
@Data
public class Demo implements Serializable {
    private static final long serialVersionUID = 1L;

}
