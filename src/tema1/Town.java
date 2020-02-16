package tema1;

public class Town implements Comparable{

	private String name;
	private int distance;
	
	public Town(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.distance;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		if (this.distance != other.distance)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		Town other = (Town) obj;
		if (this.distance < other.distance) return -1;
		else return 1;
		
	}
	
	@Override
	public String toString() {
		return name + " " + distance + '\n';
	}
	
}
