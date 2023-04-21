public class Slytherin extends Hogwarts {
	private int cunning;
	private int determination;
	private int ambition;
	private int  resourcefulness;
	private int lustForPower;
	public Slytherin(String name, int wizardPower, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower){
		super(name, wizardPower, apparitionDistance);
		this.cunning = cunning;
		this.determination = determination;
		this.ambition = ambition;
		this.resourcefulness = resourcefulness;
		this.lustForPower = lustForPower;
	}

	public int getAmbition() {
		return ambition;
	}
	public int getCunning() {
		return cunning;
	}

	public int getDetermination() {
		return determination;
	}

	public int getLustForPower() {
		return lustForPower;
	}

	public int getResourcefulness() {
		return resourcefulness;
	}

	public void setAmbition(int ambition) {
		this.ambition = ambition;
	}

	public void setCunning(int cunning) {
		this.cunning = cunning;
	}

	public void setDetermination(int determination) {
		this.determination = determination;
	}

	public void setLustForPower(int lustForPower) {
		this.lustForPower = lustForPower;
	}

	public void setResourcefulness(int resourcefulness) {
		this.resourcefulness = resourcefulness;
	}


	public String fullCharacters() {
		return hogwatsCharacters()  +
				", cunning=" + cunning +
				", determination=" + determination +
				", ambition=" + ambition +
				", resourcefulness=" + resourcefulness +
				", lustForPower=" + lustForPower;
	}
	public void comparisonStudents(Slytherin s2){
		int sumStudent1 = this.sumCharacters();
		int sumStudent2 = s2.sumCharacters();

		if (sumStudent1 > sumStudent2){
			System.out.println(this.getName() + " лучший слизеринец, чем " + s2.getName());
		} else 	if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший слизеринец, чем " + this.getName());
		} else {
			System.out.println("Студенты " + this.getName() + " и " + s2.getName()+ " одинаковые слизеринцы");
		}

	}
	private  int sumCharacters(){
		return this.getCunning()+ this.getDetermination()+ this.getAmbition() + this.getLustForPower()+ this.getResourcefulness();
	}
}

