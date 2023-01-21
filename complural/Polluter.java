package complural;

public interface Polluter {
	

	public void expulsaCO2();
	
	default void carburant() {
		System.out.println(Gas.GASOLINE.name());

}
