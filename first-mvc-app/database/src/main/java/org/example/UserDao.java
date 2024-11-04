package org.example;

import java.util.Optional;

public class UserDao {
    public Optional<User> findById(Long id){
        User user = new User();
        user.setName("Anton");
        return Optional.of(user);
    }
}
