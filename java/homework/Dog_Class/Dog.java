public class Dog {
	String name;
	String food;
	String cat_kind;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		dog1.food = "lap";
		//dog1.cat_kind = "Bengal";
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		myDogs[0].cat_kind = "Abyssinian";
		myDogs[1].cat_kind = "Persian";
		myDogs[2].cat_kind = "Bengal";
		
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			myDogs[x].chaseCat();
			if(x == 2) {
				System.out.println(myDogs[x].name + " eats " + dog1.food + " :)");
				x++;
			}else {
				myDogs[x].eat();
				x++;
			}
		}
	}
	public void bark()  {
		System.out.println(name + " says Ruff!");
	}
	public void eat() {
		System.out.println(name + " eats steak :)");
	}
	public void chaseCat() {
		System.out.println(name + " chases " + cat_kind + " cat");
	}
}

/**RESULT =>
 *null says Ruff!
 *last dog's name is Bart
 *Fred says Ruff!
 *Fred chases Abyssinian cat
 *Fred eats steak :)
 *Marge says Ruff!
 *Marge chases Persian cat
 *Marge eats steak :)
 *Bart says Ruff!
 *Bart chases Bengal cat
 *Bart eats lap :)
 */

