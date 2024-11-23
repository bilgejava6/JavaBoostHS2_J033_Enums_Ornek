package com.muhammet.entity;

import com.muhammet.utils.Gender;
import com.muhammet.utils.Language;
import com.muhammet.utils.UserState;

public class User {
    Long id;
    String name;
    String password;
    String email;
    Gender gender;
    UserState state;
    Language language;
}
