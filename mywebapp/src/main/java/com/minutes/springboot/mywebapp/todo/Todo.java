package com.minutes.springboot.mywebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	
	@Size(min=10,message="Enter at least 10 character ")
	private String description;
	
	private LocalDate targetDate;

	private boolean done;

}
