package exercise.ch52;

import java.time.LocalDateTime;

import exercise.ch51.exceptions.IDFormatException;
import exercise.ch51.exceptions.PositiveNumerExceptions;

public class PTMember {

	private String ID;
	private String name;
	private Integer height;
	private Integer weight;
	private Gender gender;
	private LocalDateTime enrollTime;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		if (ID == null)
			throw new IDFormatException("ID Not Null");
		if (ID.length() < 8 || ID.length() > 20)
			throw new IDFormatException("ID must be over 8 letters and less than 20 letters");
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public PTMember(String name, Integer height, Integer weight, String gender) {
		if (height < 0)
			throw new PositiveNumerExceptions("Height must be over 0");
		if (weight < 0)
			throw new PositiveNumerExceptions("weight must be over 0");
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = Gender.valueOfTerm(gender);
		this.enrollTime = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "PTMember [ID=" + ID + ", name=" + name + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + ", enrollTime=" + enrollTime + "]";
	}

}
