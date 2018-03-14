package prog.imper.Lab4;

public class ShadowingExample {
	public int x = 0;

	public class FirstLevel {
		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowExample.this.x = " + ShadowingExample.this.x);
		}
	}
	public static void main(String[] args)
	{
		ShadowingExample exampleOuter=new ShadowingExample();
		ShadowingExample.FirstLevel exampleInner=exampleOuter.new FirstLevel();
		exampleInner.methodInFirstLevel(5);
		
	}
	
}
