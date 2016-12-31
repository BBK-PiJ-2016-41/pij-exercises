public class Guitar {
	private WoodenObject wooden;
	private MusicalInstrument instrument;
	
	public Guitar () {
		this.wooden = new WoodenObject();
		this.instrument = new MusicalInstrument();
	}
	
	public void playGuitar(String notes) {
		this.instrument.play(notes);
	}
	
	public void burnGuitar() {
		System.out.println("Oops, did you mean to do that?");
		this.wooden.burn();
	}
}