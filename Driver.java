//author: muhd irfan


public class Driver{
	public static void main(String []arg){

	//fish is data type
	//


		Fish nemo = new Fish();//nemo ada objek fish class

		nemo.Swim();
		//nemo.color="Dark";
		nemo.SetColor( "blue");
		nemo.Swim();
		

		Fish dory =new Fish();
		dory.Swim();
		//dory.color="light";
		dory.SetColor( "yell");
		dory.Swim();


		Aquirium any =new Aquirium();
		any.fillFish();

		Shark white= new Shark();
		white.Eat();
		white.Swim();
		white.SetSharpTeeth(190);
		white.Eat();

	}
} 