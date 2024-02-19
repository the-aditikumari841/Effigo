package com.learningportal.learningportalproject.dto.request;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FavRequest {

	@Id
	private long favID;

	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

}
