package com.sahajanand.java_21_gradle_k_jar.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class User {

  private String id;

  private String email;
  private String password;
  private String resetToken;
}
