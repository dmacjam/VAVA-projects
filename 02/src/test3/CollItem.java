package test3;

public class CollItem implements Comparable<CollItem> {

	private Double d1;
	private Double d2;
	
	public Double getD1() {
		return d1;
	}
	
	public void setD1(Double d1) {
		this.d1 = d1;
	}
	
	public Double getD2() {
		return d2;
	}
	
	public void setD2(Double d2) {
		this.d2 = d2;
	}

	public Double getSum() {
		return this.d1 + this.d2;
	}
	
	@Override
	public String toString() {
		return "" + getSum();
	}

	@Override
	public int compareTo(CollItem o) {
		if(o == null) {
			throw new ClassCastException();
		}
		
		if(this.getSum() > o.getSum()) {
			return -1;
		} else if(this.getSum() < o.getSum()) {
			return 1;
		} else {
			return 0;
		}
	}
}
