package com.saurav.userManagment.controller;

import com.saurav.userManagment.model.User;
import com.saurav.userManagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/userManagement")
public class UserController {
    @Autowired
   UserService userService;
   @GetMapping(value = "getAll")
    public List<User>getUserData(){
       return userService.getAllUser();
   }
   @PostMapping(value = "addUser")
    public String save(@RequestBody User user){
       return userService.saveUserData(user);
   }
    @PutMapping(value = "updateByUserID/{userID}")
    public String updateUserData(@PathVariable String userID, @RequestBody User user ){
       return userService.updateUserData(userID,user);
   }
   @DeleteMapping(value = "deleteUser/{userID}")
    public String deleterUser(@PathVariable String userID){
       return userService.deleteUserByID(userID);
   }
}
