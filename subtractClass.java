class Addition extends Thread {
	int a, b;
	String title;

	Addition(String title, int a, int b) {
		super(title);
		this.title = title;
		this.a = a;
		this.b = b;
		start();
	}

	public void run() {
		System.out.println(this);
		int c = a + b;
		System.out.println("Addition:" + c);
	}
}

