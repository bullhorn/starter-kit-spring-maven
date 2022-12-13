package com.client.core.picker.model.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name" })
public class JsonIdName {

	private String id;
	private String name;

	public JsonIdName(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

    public JsonIdName(Integer id, String name) {
        super();
        this.id = id == null ? "" : id.toString();
        this.name = name;
    }

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
