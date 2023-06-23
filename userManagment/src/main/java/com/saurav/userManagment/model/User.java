package com.saurav.userManagment.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String userID;
    private String name;
    private String userName;
    private String Address;
    private String PhoneNum;
}
