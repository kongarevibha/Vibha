class Mona{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number : ");
n = sc.nextInt();
if(n < 0)
System.out.println("Invalid output");
else
System.out.println("Factorial of the number " + n + " is " + factorial_of_a_number(n));
}
}
