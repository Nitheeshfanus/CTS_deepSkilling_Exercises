package com.cognizant.REST.controller;


import java.util.Base64;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import com.cognizant.REST.model.AuthenticationResponse;
import com.cognizant.REST.util.JwtUtil;



@RestController
public class AuthenticationController {


    @Autowired
    private JwtUtil jwtUtil;



    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization")
            String authHeader
    ){


        String encoded =
                authHeader.substring(6);


        String decoded =
                new String(
                    Base64.getDecoder()
                    .decode(encoded)
                );


        String username =
                decoded.split(":")[0];



        String token =
                jwtUtil.generateToken(
                    username
                );



        return new AuthenticationResponse(
                token
        );


    }


}