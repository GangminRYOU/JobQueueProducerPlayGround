package com.example.producer1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.producer1.ProducerService;
import com.example.producer1.dto.JobRequest;
import com.example.producer1.dto.JobTicket;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProducerController {
	private final ProducerService producerService;

	@PostMapping("/make-job")
	// 사용자는 Make Job을 통해 처리하고 싶은 파일의 정보를 전달
	public JobTicket makeJob(
		@RequestBody
		JobRequest request) {
		// 추후 작업의 처리 상태를 판단하기 위한 jobId를 담고 있는
		// JobTicket 객체 반환
		return producerService.send(request.getFileName());
	}
}