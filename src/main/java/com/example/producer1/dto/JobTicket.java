package com.example.producer1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//사용자에게 요청의 처리상태를 확인할수 있는
//jobId를 반환하는 용도의 DTO
@AllArgsConstructor
public class JobTicket {
	private String jobId;

}
