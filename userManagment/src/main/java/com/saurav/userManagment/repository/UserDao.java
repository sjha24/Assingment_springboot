package com.saurav.userManagment.repository;

import com.saurav.userManagment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDao {

    List<User>userList = new ArrayList<>();
    public List<User> getAllUser() {
        return userList;
    }

    public boolean saveUserData(User user) {
         userList.add(user);
         return true;
    }
    public boolean updateUser(String userID, User user) {
        for(User userObj : userList){
            if(userObj.getUserID().equals(userID)){
                userObj.setName(user.getName());
                userObj.setUserName(user.getUserName());
                userObj.setAddress(user.getAddress());
                userObj.setPhoneNum(user.getPhoneNum());
                return true;
            }
        }
        return false;
    }

    public boolean removeUserByUserId(User user) {
        userList.remove(user);
        return true;
    }
}
