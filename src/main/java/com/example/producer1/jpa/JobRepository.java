package com.example.producer1.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobEntity, Long> {

	Optional<JobEntity> findByJobId(String jobId);
	//UUID는 그 특성상 UNIQUE가 왠만하면 보장된다.
	// 나중에 어떻게 jobId를 UNIQUE하게 만들지 그리고 왜 UNIQUE하게 만들어야하는지

}
