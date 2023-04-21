class Hogwarts {
	private String name;
	private int wizardPower;
	private int apparitionDistance;

	public Hogwarts(String name, int wizardPower, int apparitionDistance) {
		this.name = name;
		this.wizardPower = wizardPower;
		this.apparitionDistance = apparitionDistance;
	}

	public String getName() {
		return name;
	}

	public int getApparitionDistance() {
		return apparitionDistance;
	}

	public int getWizardPower() {
		return wizardPower;
	}

	public void setApparitionDistance(int apparitionDistance) {
		this.apparitionDistance = apparitionDistance;
	}

	public void setWizardPower(int magicPower) {
		this.wizardPower = magicPower;
	}

	public void setName(String name) {
		this.name = name;
	}

	String hogwatsCharacters() {
		return "Name: " + getName() + ", Wizard Power:" + getWizardPower() + ", Apparition Distance: " + getApparitionDistance();
	}

	public void comparisonHogwartsCharacters(Object student2) {
		if (Hogwarts.class.isAssignableFrom(student2.getClass())) {
			Hogwarts s1 = this;
			Hogwarts s2 = ((Hogwarts) student2);
			int wizPower1 = s1.getWizardPower();
			int wizPower2 = s2.getWizardPower();
			int apparitionDistance1 = s1.getApparitionDistance();
			int apparitionDistance2 = s2.getApparitionDistance();
			String nameStudent1 = s1.getName();
			String nameStudent2 = s2.getName();

			if (wizPower1 == wizPower2) {
				System.out.printf("%s и %s обладают одинаковой мощностью магии", nameStudent1, nameStudent2);
			} else if (wizPower1 > wizPower2) {
				System.out.printf("%s обладает большей мощностью магии, чем %s", nameStudent1, nameStudent2);
			} else {
				System.out.printf("%s обладает большей мощностью магии, чем %s", nameStudent2, nameStudent1);
			}
			System.out.println();

			if (apparitionDistance1 == apparitionDistance2) {
				System.out.printf("%s и %s обладают одинаковой дальностью трансгрессии", nameStudent1, nameStudent2);
			} else if (apparitionDistance1 > apparitionDistance2) {
				System.out.printf("%s обладает большей дальностью трансгрессии, чем %s", nameStudent1, nameStudent2);
			} else {
				System.out.printf("%s обладает большей дальностью трансгрессии, чем %s", nameStudent2, nameStudent1);
			}
			System.out.println();
		}
	}

}
