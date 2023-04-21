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
	public void comparisonStudents(Hufflepuff s2){
		int sumStudent1 = this.sumCharacters();
		int sumStudent2 = s2.sumCharacters();

		if (sumStudent1 > sumStudent2){
			System.out.println(this.getName() + " лучший Пуффендуец, чем " + s2.getName());
		} else if (sumStudent1 < sumStudent2) {
			System.out.println(s2.getName() + " лучший Пуффендуец, чем " + this.getName());
		} else {
			System.out.println("Студенты " + this.getName() + " и " + s2.getName()+ " одинаковые Пуффендуйцы");
		}
	}
	private int sumCharacters(){
		return this.getLoyalty()+ this.getFairness() + this.getHardWorking();
	}
}
