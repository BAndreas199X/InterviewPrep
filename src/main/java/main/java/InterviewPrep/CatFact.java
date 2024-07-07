package main.java.InterviewPrep;

import java.util.Objects;

public class CatFact {

	private String fact;
	private int length;
	
	public String getFact() {
		return fact;
	}
	public void setFact(String fact) {
		this.fact = fact;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		return "CatFact [fact=" + fact + ", length=" + length + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fact, length);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatFact other = (CatFact) obj;
		return Objects.equals(fact, other.fact) && length == other.length;
	}
	
	
}
