class Numberofvowels
{
public static void main(String[] args)
{
String str="ovikels";
System.out.println(count(str));
}

static int count(String str)
{
int count=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println(ch);
count++;
}
}
return count;
}
}

