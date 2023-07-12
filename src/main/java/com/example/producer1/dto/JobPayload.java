package com.example.producer1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//Producer가 발생시킬 Job을 정의한 DTO
//Producer와 RabbitMQ로 전달하는 DTO
public class JobPayload {
	private String jobId;
	private String fileName;
	private String path;
}
