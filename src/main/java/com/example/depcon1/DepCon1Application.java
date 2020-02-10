package com.example.depcon1;

import lombok.extern.flogger.Flogger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DepCon1Application {

  public static void main(String[] args) {
    SpringApplication.run(DepCon1Application.class, args);

    Glitch g = new Glitch();

    log.info(g.identify("me"));
  }

}
