package co.grandcircus.famouslab.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FamousLabResponse {

	@JsonProperty("tiny")
	private List<Inventor> inventors;

	@JsonProperty("complete")
	private List<Innovator> innovators;


	public List<Inventor> getInventors() {
		return inventors;
	}

	public void setInventors(List<Inventor> inventors) {
		this.inventors = inventors;
	}

	public List<Innovator> getInnovators() {
		return innovators;
	}

	public void setInnovators(List<Innovator> innovators) {
		this.innovators = innovators;
	}

	@Override
	public String toString() {
		return "FamousLabResponse [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
