package com.sahajanand.java_21_gradle_k_jar.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class JournalEntry {

  private String id;

  @Builder.Default
  private String title = "Test title";

  private String content;
}
