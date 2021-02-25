package com.baba.concurrency.synchronization;

import java.util.Objects;

public class User {

    private Integer id;

    public User(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void updateId() {
        if (Objects.isNull(id))
            id = 0;

        setId(++id);
    }
}
