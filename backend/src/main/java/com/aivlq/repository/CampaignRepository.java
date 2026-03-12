package com.aivlq.repository;

import com.aivlq.model.Campaign;
import com.aivlq.model.CampaignStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    Optional<Campaign> findTopByOrderByCreatedAtDesc();
    Optional<Campaign> findByStatus(CampaignStatus status);
}