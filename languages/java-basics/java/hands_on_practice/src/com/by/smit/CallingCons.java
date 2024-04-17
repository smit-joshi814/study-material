package com.by.smit;

class Ab {
	Ab() {
		System.out.println("Inside Ab's Constructor");
	}
}

class Bc extends Ab {
	Bc() {
		System.out.println("Inside Bc's Constructor");
	}
}

class Cc extends Bc {
	Cc() {
		System.out.println("Inside Cc's Constructor");
	}
}

class CallingCons {
	public static void main(String[] args) {
//		Cc chk=new Cc();
	}
}
