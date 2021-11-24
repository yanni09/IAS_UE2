class Point {
    private double x,y;
    

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    public String toString() {
            return "(" + this.getX() + ", " + this.getY() + ")";
    }

    Point move(Point shift) {
        this.x  = this.x + shift.x;		
		this.y = this.y + shift.y;		
		return this;
    }

    Point moveTo(Point newPos) {
        this.x  = newPos.x;		
		this.y = newPos.y;		
		return this;
    }

    Point scale(double factor) {
        this.x  = factor * this.x;
		this.y = factor *this.y;
		return this;
    }

    double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    double distance(Point other) {
        Point diff = new Point(this.x - other.x, this.y - other.y);
		return diff.distance();
    }

    boolean equals(Point other) {
        if(other == null)
			return false;
		return (this.x == other.x && this.y == other.y);
    }
}