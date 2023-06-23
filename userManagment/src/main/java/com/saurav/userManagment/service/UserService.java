package com.saurav.userManagment.service;

import com.saurav.userManagment.model.User;
import com.saurav.userManagment.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public String saveUserData(User user) {
        boolean status = userDao.saveUserData(user);
        if(status){
            return "userList saved";
        }
        return "not save your user data";
    }
    public User getUserById(String userID) {
        for(User userObj : getAllUser()){
            if(userObj.getUserID().equals(userID)){
               return userObj;
            }
        }
        return null;
    }

    public String updateUserData(String userID, User user) {
        boolean res = userDao.updateUser(userID,user);
        if(res){
            return "user list update successful";
        }
        return "can't update error !!!";
    }

    public String deleteUserByID(String userID) {
        List<User>userData = getAllUser();
        boolean res = false;
        for(User user : userData){
            if(user.getUserID().equals(userID)){
                res = userDao.removeUserByUserId(user);
                if(res==true){
                    return "userId "+userID+" remove from our user list";
                }else{
                    return "can't removed database error !!";
                }
            }
        }
        return "not find this user data "+userID;
    }
}