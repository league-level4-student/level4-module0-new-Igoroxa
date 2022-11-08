package _04_Snake;

public class Location {

	private int x;
	private int y;
	
	public Location(int nextx, int nexty) {
		this.x = nextx;
		this.y = nexty;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
boolean equals(Location secondLocation) {
	if (x == secondLocation.x && y == secondLocation.y) {
		return true;
	}
	return false;
	
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
}
