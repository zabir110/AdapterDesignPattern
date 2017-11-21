
public class School {

	public static void main(String[] args) {
		AssignmentWork aWork=new AssignmentWork();
		Pen pen =new PenAdapter();
		aWork.setPen(pen);
		aWork.writeAssignment("We are tired to write something");
		

	}

}
