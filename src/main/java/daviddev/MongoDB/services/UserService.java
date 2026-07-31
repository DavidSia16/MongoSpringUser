package daviddev.MongoDB.services;

import daviddev.MongoDB.repositories.UserRepository;
import lombok.AllArgsConstructor;
import models.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        if (user == null) {
            return null;
        }
      User existingUser = getUserById(user.getId());
        if (existingUser == null) {
            return existingUser;
        }
        BeanUtils.copyProperties(user, existingUser);
        return userRepository.save(existingUser);
    }
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
