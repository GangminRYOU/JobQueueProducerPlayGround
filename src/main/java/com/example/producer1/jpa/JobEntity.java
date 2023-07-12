package com.example.producer1.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "jobs")
public class JobEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//작업을 식별하기 위한, Id로써 UUID 사용
	private String jobId;

	//작업의 상태를 저장하기 위한 Status
	//IDLE: 아직 처리 시작전
	//PROCESSING: 어떤 consumer에 의해 작업이 처리되기 시작
	//DONE: 작업처리 끝
	private String status;

	//인코딩이 끝난 영상이 위치할 곳 (가정)
	private String resultPath;
	/*1. 사용자는 파일전달, 서버는 jobId를 발행
	* 2. Producer가 메세지 큐에 파일 처리 전달 ->
	* 3. Producer가 jobId를 클라이언트에 보냄
	* 4. 클라이언트는 JobId를 가지고 작업 상태 확인 -> 클라이언트는 jobId를 기준으로 완료되었는지 확인
	*  - 나중에 클라이언트가 id로 조회하면, 프로듀서가 DB조회해서 클라이언트에게 알려줌*/
}
