package basics;

public class ForLoop {
	int b;

	public static void main(String[] args) {
		Holder h = new Holder();
		System.out.println(h.getI());

//		int a[] = { 1, 2, 3, 4 };
//		for (int i = 0; i < a.length; i++) {
//			if (i == 0) {
//				b = a[0];
//			} else {
//				b += 1;
//			}
//		}
//		System.out.println(b);
		ForLoop fl = new ForLoop();
		fl.dummy();
	}

	private void dummy() {
//		System.out.println(b);

		int a[] = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				b = a[0];
			} else {
				b += 1;
			}
		}
		System.out.println(b);
	}
}
