package kr.ac.jejunu.fanal.controller;


import kr.ac.jejunu.fanal.model.User;
import kr.ac.jejunu.fanal.repository.UserRepository;
import kr.ac.jejunu.fanal.service.UserServices;
import kr.ac.jejunu.fanal.vo.LoginVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin()
@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserRepository userRepository;
    private final UserServices userServices;


    @PostMapping(value="/addUser", consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User create(@RequestBody User user) {
        return userServices.create_user(user);
    }

    @GetMapping("/read/{id}")
    public Optional<User> read(@PathVariable Long id){
        System.out.println(id);
        System.out.println(userServices.get_user(id));
        return userServices.get_user(id);
    }
    @GetMapping("/getuserby/{username}")
    public User getuserbyname(@PathVariable String username){
        return userServices.getid_byusername(username);
    }
    @PostMapping(value ="/login", consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean login(@RequestBody LoginVO loginVO){
        System.out.println("컨트롤"+loginVO.getUsername() + loginVO.getPassword());
        return userServices.login(loginVO.getUsername(), loginVO.getPassword());
    }

    @PutMapping("/update")
    public User update(@PathVariable User user){
        return userServices.update_user(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userServices.delete(id);
    }
}