package com.aivlq.repository;

import com.aivlq.model.Lead;
import com.aivlq.model.LeadStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
    Page<Lead> findByStatus(LeadStatus status, Pageable pageable);
    List<Lead> findByStatus(LeadStatus status);
    long countByStatus(LeadStatus status);
    Optional<Lead> findByPhone(String phone);
    boolean existsByPhone(String phone);
}