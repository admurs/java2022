package kodlamaIo.entities;

public class Course {

	private int id;
	private String name;
	private double progress;
	private Educator educator;
	private int percentage;
	private double price;
	
	public Course(int id, String name, double progress, Educator educator, int percentage,double price) {
		super();
		this.id = id;
		this.name = name;
		this.progress = progress;
		this.educator = educator;
		this.percentage = percentage;
		this.price=price;
	}
	public Course() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public Educator getEducator() {
		return educator;
	}
	public void setEducator(Educator educator) {
		this.educator = educator;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
