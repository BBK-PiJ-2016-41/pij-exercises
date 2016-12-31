public abstract class Animal {
	private String sound;
	private String response;
	private String name;
	public void makeSound(){
		System.out.println(this.sound);
	}
	public void call() {
		System.out.println(this.response);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public abstract void reproduce();
}
