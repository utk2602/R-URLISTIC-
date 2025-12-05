package models;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UrlMapping {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
      private String originalUrl;
      private String shortUrl;
      private int clickCount = 0;
      private LocalDateTime createdDateTime;
}
