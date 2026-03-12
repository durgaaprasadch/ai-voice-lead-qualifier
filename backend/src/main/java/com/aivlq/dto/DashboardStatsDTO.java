package com.aivlq.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DashboardStatsDTO {
    private long totalLeads;
    private long interested;
    private long notInterested;
    private long followUp;
    private long pending;
    private long failed;
    private long noAnswer;
    private long calling;
}