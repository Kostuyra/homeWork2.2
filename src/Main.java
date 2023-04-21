public class Main {
	public static void main(String[] args) {
		Gryffindor harryPotter = new Gryffindor("Harry Potter", 65, 250, 90, 80, 88);
		Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 88, 260, 85, 80, 80);
		Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 70, 240, 92, 84, 86);

		Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 40, 250, 90, 80, 88);
		Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 80, 300, 90, 90, 88);
		Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 50, 200, 81, 70, 74);

		Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 60, 300, 70, 80, 90, 90, 66);
		Slytherin grahamMontague = new Slytherin("Graham Montague", 88, 250, 60, 76, 77, 88, 66);
		Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 40, 100, 56, 62, 77, 59, 66);

		Ravenclaw choChang = new Ravenclaw("Cho Chang", 73, 100, 62, 56, 77, 54);
		Ravenclaw padmaPatil = new Ravenclaw("Padma Patil,", 77, 92, 70, 84, 72, 90);
		Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 68, 125, 70, 73, 80, 77);


		Hogwarts.comparisonHogwartsCharacters(dracoMalfoy, harryPotter);
		Hogwarts.comparisonHogwartsCharacters(grahamMontague, choChang);
		Hufflepuff.comparisonStudents(zachariasSmith, cedricDiggory);
		System.out.println(harryPotter.fullCharacters());
	}
}