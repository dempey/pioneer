package com.github.dempey.pioneer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {



}
