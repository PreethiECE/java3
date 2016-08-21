public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int n,c=0;
System.out.println("Enter number");
n=in.nextInt();
while(n>0)
{
n=n/10;
c++;
}
System.out.println(c);
}
