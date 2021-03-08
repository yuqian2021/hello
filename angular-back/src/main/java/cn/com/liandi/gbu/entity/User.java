package cn.com.liandi.gbu.entity;

import lombok.Data;

/**
 * @author yuqain
 */
@Data
public class User {
    Integer id;
    String name;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}