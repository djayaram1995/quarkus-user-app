package dev.dj.service;

import dev.dj.entity.User;
import dev.dj.repository.UserRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@ApplicationScoped
public class UserService {

    private UserRepository userRepository;

    public Uni<List<User>> getAllUser() {
        return userRepository.listAll();
    }

    public Uni<User> createUser(User user) {
        return userRepository.persist(user);
    }
}
