package com.baba.concurrency.synchronization;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UpdateUserInfoSync {

    private void updateUserInfo(User user) {
        user.updateId();
        System.out.println(user.getId());
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            UpdateUserInfoSync updateUserInfoSync = new UpdateUserInfoSync();
            for (int i = 0; i < 10; i++) {
                User user = new User(1);
                service.submit(() -> updateUserInfoSync.updateUserInfo(user));
            }
        } finally {
            if (Objects.nonNull(service))
                service.shutdown();
        }
    }
}
