public class Gryffindor extends Hogwarts {
	private int chivalry;
	private int courage;
	private int bravery;


	public Gryffindor(String name, int wizardPower, int apparitionDistance, int chivalry, int courage, int bravery) {
		super(name, wizardPower, apparitionDistance);
		this.chivalry = chivalry;
		this.courage = courage;
		this.bravery = bravery;
	}

	public void setBravery(int bravery) {
		this.bravery = bravery;
	}

	public void setChivalry(int chivalry) {
		this.chivalry = chivalry;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getBravery() {
		return bravery;
	}

	public int getChivalry() {
		return chivalry;
	}

	public int getCourage() {
		return courage;
	}

	public String houseCharacters() {
		return "chivalry=" + chivalry +
				", courage=" + courage +
				", bravery=" + bravery;
	}

	public String fullCharacters() {
		return hogwatsCharacters() + ", " + houseCharacters();
	}

	public void comparisonStudents(Gryffindor s2){
		int sumStudent1 = this.sumCharacters();
		int sumStudent2 = s2.sumCharacters();

		if (sumStudent1 > sumStudent2){
			System.out.println(this.getName() + " лучший гриффиндорец, чем " + s2.getName());
		} else if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший гриффиндорец, чем " + this.getName());
		} else {
			System.out.println("Студенты " + this.getName() + " и " + s2.getName()+ " одинаковые гриффиндорцы");
		}

	}

	private int sumCharacters(){
		return this.getCourage() + this.getBravery() + this.getChivalry();
	}
}
