package resolventenbildung;

public class Literal {
	public char bezeichner;
	public boolean wahrheitswert;
	
	public Literal(char bezeichner, boolean wahrheitswert) {
		this.bezeichner = bezeichner;
		this.wahrheitswert = wahrheitswert;
	}

	public char getBezeichner() {
		return bezeichner;
	}

	public void changeWahrheitswert() {
		wahrheitswert = !wahrheitswert;
	}
	
	public boolean getWahrheitswert() {
		return wahrheitswert;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;
		result = prime * result + bezeichner;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Literal other = (Literal) obj;
		
		 if ((bezeichner != other.bezeichner) || (wahrheitswert != other.wahrheitswert)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (wahrheitswert == false) {
			builder.append('!');
		}
		builder.append(bezeichner);
		return builder.toString();
	}

	
}
