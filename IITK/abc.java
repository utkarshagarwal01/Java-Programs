class abc
{
	public static void main(String[] args) {
		int a[]={0,2,3,4};
		
		
		fuj(0);
	}
	static void fuj(int a)
	{
		System.out.println(a);
		fuj(++a);
	}
}