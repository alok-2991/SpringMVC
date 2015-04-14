package com.nenosystems.dto;

public class RoleDTO extends BaseDTO {

	public static final long ROLE_ADMIN = 1;

	public static final long ROLE_STUDENT = 2;
	public static final long ROLE_COLLEGE = 3;
	public static final long ROLE_KIOSK = 4;

	private String name;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
