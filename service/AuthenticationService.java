package com.timetablemanagementsystem.app.service;

import com.timetablemanagementsystem.app.collection.User;
import com.timetablemanagementsystem.app.dto.JwtAuthenticationResponse;
import com.timetablemanagementsystem.app.dto.SignInRequest;
import com.timetablemanagementsystem.app.dto.SignUpRequest;

public interface AuthenticationService {
    public User signup(SignUpRequest signUpRequest);

    public JwtAuthenticationResponse signin(SignInRequest signInRequest);
}
