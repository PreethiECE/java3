public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int n,sum=0;
System.out.println("Enter number");
n=in.nextInt();
for(int i=1;i<=n;i++)
sum+=i;
System.out.println(sum);
}
