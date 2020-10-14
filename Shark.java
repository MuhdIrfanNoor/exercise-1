public class Shark extends Fish{
	private int sharpTeeht=50;

	public void Eat(){
		System.out.println("Eat with"+ sharpTeeht+" number of teeth");

	}
	public void SetSharpTeeth(int teeth){
		sharpTeeht =teeth;
	}
}