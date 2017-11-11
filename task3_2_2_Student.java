
public class Student {

	public static void main(String[] args) {

		int[] Alex = { 5, 5, 5, 5, 5, 5, 5, 5 };
		int[] Alena = { 2, 4, 3, 4, 3, 3, 4, 4 };
		int[] Lauren = { 3, 4, 2, 4, 5, 2, 4, 4 };

		// определить средний балл учебной группы
		Group group1 = new Group();
		group1.calcMedium(Alex, Alena, Lauren);
		System.out.println("средний балл учебной группы: " + group1.getMedium());

		// средний балл каждого студента
		int sumAlex = 0;
		for (int i : Alex)
			sumAlex += i;
		int medAlex = sumAlex / Alex.length;

		int sumAlena = 0;
		for (int i : Alena)
			sumAlena += i;
		int medAlena = sumAlena / Alena.length;

		int sumLauren = 0;
		for (int i : Lauren)
			sumLauren += i;
		int medLauren = sumLauren / Lauren.length;

		System.out.println("средний балл студента Alex: " + medAlex);
		System.out.println("средний балл студента Alena: " + medAlena);
		System.out.println("средний балл студента Lauren: " + medLauren);

		// определить число отличников

		System.out.println("число отличников: " + countClassman(medAlex, medAlena, medLauren));

		// определить количество студентов, имеющих "2".

		System.out.println("число студентов, имеющих \"2\": " + countSlacker(Alex, Alena, Lauren));

	}

	public static int countClassman(int medAlex, int medAlena, int medLauren) {
		int classMan = 0;

		if (medAlex == 5) {
			classMan = classMan + 1;
		}

		if (medAlena == 5) {
			classMan = classMan + 1;
		}

		if (medLauren == 5) {
			classMan = classMan + 1;
		}

		return classMan;

	}

	public static int countSlacker(int[] alex, int[] alena, int[] lauren) {
		int slacker = 0;
		for (int i : alex) {
			if (i == 2) {
				slacker = slacker + 1;
				break;
			}
		}
		for (int i : alena) {
			if (i == 2) {
				slacker = slacker + 1;
				break;
			}
		}

		for (int i : lauren) {
			if (i == 2) {
				slacker = slacker + 1;
				break;
			}
		}
		return slacker;

	}
}

class Group {

	private int medium;

	public void calcMedium(int[] alex, int[] alena, int[] lauren) {

		int sumAlex = 0;
		for (int i : alex)
			sumAlex += i;
		int medAlex = sumAlex / alex.length;

		int sumAlena = 0;
		for (int i : alena)
			sumAlena += i;
		int medAlena = sumAlena / alena.length;

		int sumLauren = 0;
		for (int i : lauren)
			sumLauren += i;
		int medLauren = sumLauren / lauren.length;

		medium = (medAlex + medAlena + medLauren) / 3;

	}

	public int getMedium() {
		return medium;
	}
}
