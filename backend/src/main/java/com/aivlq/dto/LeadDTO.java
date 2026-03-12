package com.aivlq.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeadDTO {
    private Long id;
    private String name;
    private String phone;
    private String company;
    private String status;
    private String aiSummary;
    private String sentiment;
    private String followUpSuggestion;
    private String recordingUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}