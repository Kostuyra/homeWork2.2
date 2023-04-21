public class Hufflepuff extends Hogwarts{
	private int hardWorking;
	private  int loyalty;
	private int fairness;
	public Hufflepuff(String name,int wizardPower, int apparitionDistance, int hardWorking, int loyalty, int fairness){
		super(name, wizardPower, apparitionDistance);
		this.hardWorking = hardWorking;
		this.loyalty = loyalty;
		this.fairness = fairness;
	}

	public int getFairness() {
		return fairness;
	}

	public int getHardWorking() {
		return hardWorking;
	}

	public int getLoyalty() {
		return loyalty;
	}

	public void setFairness(int fairness) {
		this.fairness = fairness;
	}
	public void setHardWorking(int hardWorking) {
		this.hardWorking = hardWorking;
	}

	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}


	public String fullCharacters() {
		return hogwatsCharacters()  +
				", hardWorking=" + hardWorking +
				", loyalty=" + loyalty +
				", fairness=" + fairness ;
	}
	public static void comparisonStudents(Hufflepuff s1, Hufflepuff s2){
		int sumStudent1 = sumCharacters(s1);
		int sumStudent2 = sumCharacters(s2);

		if (sumStudent1 > sumStudent2){
			System.out.println(s1.getName() + " лучший Пуффендуец, чем " + s2.getName());
		} else if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший Пуффендуец, чем " + s1.getName());
		} else {
			System.out.println("Студенты " + s1.getName() + " и " + s2.getName()+ " одинаковые Пуффендуйцы");
		}
	}
	private static int sumCharacters(Hufflepuff student){
		return student.getLoyalty()+ student.getFairness() + student.getHardWorking();
	}
}
