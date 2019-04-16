// TODO Inner method changeOuter() to call Outer Method displayName()
// TODO call changeOuter() from createInner()

public class Outer {
	
	private String name = "Original Outer Name";
	private void displayName() {
		System.out.println(this.name);
	}
	
	private Inner createInner() {
		return new Inner();		
	}
	
	
	private class Inner {
		private String innerName = "Inner Name";
		private void changeOuter() {
			Outer.this.name = "Altered Outer Name";
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.createInner().changeOuter();
		outer.displayName();
		System.out.println(outer.createInner().innerName);
	}
}
