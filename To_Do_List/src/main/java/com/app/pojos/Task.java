package com.app.pojos;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tasks")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Task {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;
	
	@Column(name="Title",length=50)
	private String title;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="Priority")
	private String priority;
	
	public Task(Object object, String string, String string2, boolean b) {
		
	}
}
