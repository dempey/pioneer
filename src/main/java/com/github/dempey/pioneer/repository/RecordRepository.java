package com.github.dempey.pioneer.repository;

import com.github.dempey.pioneer.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {



}
