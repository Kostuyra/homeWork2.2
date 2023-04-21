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
	public static void comparisonStudents(Slytherin s1, Slytherin s2){
		int sumStudent1 = sumCharacters(s1);
		int sumStudent2 = sumCharacters(s2);

		if (sumStudent1 > sumStudent2){
			System.out.println(s1.getName() + " лучший слизеринец, чем " + s2.getName());
		} else 	if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший слизеринец, чем " + s1.getName());
		} else {
			System.out.println("Студенты " + s1.getName() + " и " + s2.getName()+ " одинаковые слизеринцы");
		}

	}
	private static int sumCharacters(Slytherin student){
		return student.getCunning()+ student.getDetermination()+ student.getAmbition() + student.getLustForPower()+ student.getResourcefulness();
	}
}

