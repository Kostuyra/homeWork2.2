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

	public static void comparisonStudents(Gryffindor s1, Gryffindor s2){
		int sumStudent1 = sumCharacters(s1);
		int sumStudent2 = sumCharacters(s2);

		if (sumStudent1 > sumStudent2){
			System.out.println(s1.getName() + " лучший гриффиндорец, чем " + s2.getName());
		} else if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший гриффиндорец, чем " + s1.getName());
		} else {
			System.out.println("Студенты " + s1.getName() + " и " + s2.getName()+ " одинаковые гриффиндорцы");
		}

	}

	private static int sumCharacters(Gryffindor student){
		return student.getCourage() + student.getBravery() + student.getChivalry();
	}
}
