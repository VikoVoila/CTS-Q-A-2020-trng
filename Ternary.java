class Ternary{
	public static void main(String[] args){
		int a=9, b=54, c=1, result, temp;
		 temp = a>b ? a:b;
       		 result = c>temp ? c:temp;
        		System.out.println("Largest Number is:"+result);
	}
}