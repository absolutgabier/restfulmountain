package be.intebrussel.restmountain.model;

public class Mountain {
	private final long id;
    private final String name;
    private double height;
    
    public Mountain(long id, String name, double height) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	}
    
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Mountain [id=" + id + "/n, name=" + name + "/n, height=" + height + "/n]";
	}
	
}
