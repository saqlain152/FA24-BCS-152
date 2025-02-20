import java.util.Scanner;
public class User{

static String name="saqlain";
static String password="1234";





public static void main (String args[]){
Scanner sc =new Scanner(System.in);
Scanner sa =new Scanner(System.in);
System.out.print("Enter the name : ");
String name=sc.nextLine();
System.out.print("Enter the password : ");
String password=sa.nextLine();
if(name.equals(name)&&password.equals(password)){

System.out.print("Verified successfully ");



}
else
System.out.print("Wrong credentials ");


} 

}

