package com.aivlq.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QualificationResultDTO {
    private String classification;
    private String summary;
    private String sentiment;
    private String followUpSuggestion;
}