package kr.ac.jejunu.fanal;


import kr.ac.jejunu.fanal.model.User;
import kr.ac.jejunu.fanal.repository.UserRepository;
import kr.ac.jejunu.fanal.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class UserController {


    @Autowired
    private final UserRepository userRepository;
    UserServices userServices;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/addUser")
    public User create(@RequestBody User user) {

        userServices = new UserServices();
        return userServices.create_user(user, userRepository);
    }

    @GetMapping("/read/{id}")
    public Optional<User> read(@PathVariable Long id){
        userServices = new UserServices();
        System.out.println(userServices.get_user(id,userRepository));
        return userServices.get_user(id,userRepository);
    }
    @PutMapping("/update")
    public User update(@PathVariable User user){
        userServices = new UserServices();
        return userServices.update_user(user,userRepository);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userServices = new UserServices();
        userServices.delete(id, userRepository);
    }
}