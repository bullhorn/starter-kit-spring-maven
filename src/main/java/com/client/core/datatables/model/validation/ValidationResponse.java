package com.client.core.datatables.model.validation;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonPropertyOrder(value={"status", "summary", "detail"})
@XmlRootElement(name="ValidationResponse")
@XmlType(propOrder = {"status", "summary", "detail"})
public class ValidationResponse {

	private String status;
	private String summary;
	private List<String> detail;

	public ValidationResponse() {
		super();
	}

	public ValidationResponse(String status, String summary, List<String> detail) {
		super();
		this.status = status;
		this.summary = summary;
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<String> getDetail() {
		return detail;
	}

	public void setDetail(List<String> detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");

		result.append("{" + NEW_LINE);
		result.append(" status: " + status + "," + NEW_LINE);
		result.append(" summary: " + summary + "," + NEW_LINE);
		result.append(" detail: " + NEW_LINE);
		result.append(" [ " + NEW_LINE);
		if (detail != null) {
			for (String s : detail) {
				result.append(s + NEW_LINE);
			}
		}
		result.append(" ] " + NEW_LINE);
		result.append("}");

		return result.toString();

	}

}
