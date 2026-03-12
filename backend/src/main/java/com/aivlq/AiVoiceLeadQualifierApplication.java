package com.aivlq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AiVoiceLeadQualifierApplication {
    public static void main(String[] args) {
        SpringApplication.run(AiVoiceLeadQualifierApplication.class, args);
    }
}
