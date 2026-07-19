package com.cognizant.REST.util;


import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtUtil {


    private final SecretKey key =
            Keys.hmacShaKeyFor(
                "mysecretkeymysecretkeymysecretkey12345"
                .getBytes()
            );



    public String generateToken(String username){


        return Jwts.builder()

                .subject(username)

                .issuedAt(
                    new Date()
                )

                .expiration(
                    new Date(
                        System.currentTimeMillis()
                        +
                        20 * 60 * 1000
                    )
                )

                .signWith(key)

                .compact();


    }


}