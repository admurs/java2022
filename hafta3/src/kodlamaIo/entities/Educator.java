package kodlamaIo.entities;

public class Educator {

	private int id;
	private String name;
	private String surname;
	private String information;
	private String imgUrl;
	public Educator(int id, String name, String surname, String information, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.information = information;
		this.imgUrl = imgUrl;
	}
	public Educator() {
		
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
