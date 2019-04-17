
public class Outer {
	
	private String name = "Original Outer Name";
	private void displayName() {
		System.out.println(this.name);
	}
	
	private void createInner() {
		new Inner().changeOuter();
	}
	
	private class Inner {
		private void changeOuter() {
			Outer.this.name = "Altered Outer Name";
			Outer.this.displayName();
		}
	}
	
	private Inner2 createInner2() {
		return new Inner2();
	}
	
	private class Inner2 {
		private String innerName2 = "Inner Name 2";
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.createInner();
		System.out.println(outer.createInner2().innerName2);
	}
}

