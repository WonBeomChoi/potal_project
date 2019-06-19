package kr.ac.jejunu.fanal.service;

import kr.ac.jejunu.fanal.model.User;
import kr.ac.jejunu.fanal.repository.UserRepository;

import java.util.Optional;

public class UserServices {

    public User create_user(User user, UserRepository userRepository) {
        return userRepository.save(user);
    }
    public Optional<User> get_user(Long id, UserRepository userRepository){
        return userRepository.findById(id);
    }

    public User update_user(User user, UserRepository userRepository) {
        return userRepository.save(user);
    }
    public void delete(Long id, UserRepository userRepository){
        userRepository.deleteById(id);
    }
}
