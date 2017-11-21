import UseFriendPen.Manik;

public class PenAdapter implements Pen {
	Manik manik=new Manik();

	@Override
	public void write(String s) {
		manik.mark(s);
	}
	
	
}
