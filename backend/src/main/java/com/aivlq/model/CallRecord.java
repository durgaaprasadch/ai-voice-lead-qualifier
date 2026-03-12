package com.aivlq.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "call_records")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CallRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lead_id", nullable = false)
    private Lead lead;

    @Column(length = 100)
    private String twilioCallSid;

    @Column(length = 50)
    private String callStatus;

    @Column(length = 500)
    private String recordingUrl;

    @Column(columnDefinition = "TEXT")
    private String transcript;

    private Integer duration;

    private LocalDateTime calledAt;

    private LocalDateTime completedAt;
}