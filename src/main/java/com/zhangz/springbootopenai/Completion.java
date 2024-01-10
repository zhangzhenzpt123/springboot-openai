package com.zhangz.springbootopenai;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Completion implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String completion;

    public Completion(String completion) {
        this.completion = completion;
    }

    public String getCompletion() {
        return completion;
    }
}
