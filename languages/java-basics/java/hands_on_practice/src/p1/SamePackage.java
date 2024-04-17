package p1;

class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("Same package Constructor");
		System.out.println("n: " + p.n);

		// class Only
//		System.out.println("n_pri: "+p.n_pri);
		System.out.println("n_pro: " + p.n_pro);
		System.out.println("n_pub: " + p.n_pub);
	}
}
