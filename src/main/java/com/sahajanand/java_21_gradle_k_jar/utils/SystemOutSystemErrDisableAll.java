package com.sahajanand.java_21_gradle_k_jar.utils;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class SystemOutSystemErrDisableAll {

  @PostConstruct
  public void init() {
    Utils.disableAllSystemOutSystemErr(false);
  }
}
