package com.example.depcon1;


import org.springframework.stereotype.Component;

@Component
public class Glitch {

  String identify(String who) {

    return "here..." + who;

  }

}
