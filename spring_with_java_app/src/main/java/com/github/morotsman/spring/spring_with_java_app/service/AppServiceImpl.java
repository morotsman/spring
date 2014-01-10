/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.morotsman.spring.spring_with_java_app.service;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService{

    public void helloWorld() {
        System.out.println("Hello world!");
    }
    
}
