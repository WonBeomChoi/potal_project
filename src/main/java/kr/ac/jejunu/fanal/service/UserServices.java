package kr.ac.jejunu.fanal.service;

import kr.ac.jejunu.fanal.model.User;
import kr.ac.jejunu.fanal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServices {

    private final UserRepository userRepository;

    public User create_user(User user) {
        return userRepository.save(user);
    }

    public Optional<User> get_user(Long id){
        return userRepository.findById(id);
    }
    public User getid_byusername(String username){
        return userRepository.findByUsername(username);
    }
    public boolean login(String username, String password){
        System.out.println(password);
        User user = null;
        try {
            user = userRepository.findByUsername(username);
            System.out.println(user);
            if(username.equals(user.getUsername())){
                System.out.println(password);
                if(password.equals(user.getPassword())){
                    return true;
                }
                else{
                    System.out.println("비밀번호틀림");
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }
    public User update_user(User user) {
        return userRepository.save(user);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
