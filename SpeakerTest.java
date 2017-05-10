class SpeakerTest{

	public static void main(String[] args) {
		

		Human h1 = new Human();

		h1.speak();
		h1.announce("we're human");



		Cat c1 = new Cat();


		c1.speak();

		c1.announce("we're cat");

		Fish f1 = new Fish();

		f1.speak();
		f1.announce("we're fish");


	}
}