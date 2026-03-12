package com.aivlq.repository;

import com.aivlq.model.CallRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CallRecordRepository extends JpaRepository<CallRecord, Long> {
    List<CallRecord> findByLeadId(Long leadId);
    Optional<CallRecord> findByTwilioCallSid(String callSid);
}