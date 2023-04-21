public class Ravenclaw extends Hogwarts {
	private int intelligence;
	private int wisdom;
	private int wit;
	private int creativity;

	public Ravenclaw(String name, int wizardPower, int apparitionDistance, int intelligence, int wisdom, int wit, int creativity) {
		super(name,wizardPower, apparitionDistance);
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.wit = wit;
		this.creativity = creativity;
	}

	public int getCreativity() {
		return creativity;
	}

	public int getWisdom() {
		return wisdom;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getWit() {
		return wit;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public void setWit(int wit) {
		this.wit = wit;
	}

	public void setCreativity(int creativity) {
		this.creativity = creativity;
	}


	public String fullCharacters() {
		return hogwatsCharacters() +
				", intelligence=" + intelligence +
				", wisdom=" + wisdom +
				", wit=" + wit +
				", creativity=" + creativity;
	}
	public static void comparisonStudents(Ravenclaw s1, Ravenclaw s2){
		int sumStudent1 = sumCharacters(s1);
		int sumStudent2 = sumCharacters(s2);

		if (sumStudent1 > sumStudent2){
			System.out.println(s1.getName() + " лучший когтевранец, чем " + s2.getName());
		} else if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший когтевранец, чем " + s1.getName());
		} else {
			System.out.println("Студенты " + s1.getName() + " и " + s2.getName()+ " одинаковые когтевранцы");
		}
			}
	private static int sumCharacters(Ravenclaw student){
		return student.getWisdom()+ student.getWit() + student.getIntelligence()+ student.getCreativity();
	}
}
