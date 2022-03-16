package java1;

public class test {
	int x=10;
	int y=20;
	
	
void Add()
{ System.out.println ("sum="+ (x+y));}


void sub() {
	System.out.println("substraction"+ (x-y));
}

	public static void main(String[] args) {
		test c= new test();
		c.Add();
		c.sub();	

	}

}
