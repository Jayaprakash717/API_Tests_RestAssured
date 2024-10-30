package model;

public class Users {
	
	private String name;
	private String job;
	
	public Users() {}
	
	public Users(String nme,String job) {
		setName(name);
		setJob(job);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
