public class Product{
private static int productcounter=1;
private String id;
private String name;
private int quantity ;
private int price;
private String category;


public product(String pid,String pname,int pquantity,int pprice,String pcategory){
id=pid;
name=pname;
quantity=pquantity;
price=pprice;
category=pcategory;
}
 

public void display(){
System.out.printf("Product id :%s \n"+id);
System.out.printf("Product name : %s \n"+name);
System.out.printf("Product quantity : %d\n"+quantity);
System.out.printf("Product price : %f\n"+price);
System.out.printf("Product category : %s\n"+category);}



// public void  setid(){
// productid=id;}
// public String getid(String a){
// return product id ;

// }
// public void  setname(){
// productname=name;}
// public String getname(String b){
// return product name ;

// }
// public void  setquantity(){
// productquantity=quantity;}
// public int  getquantity(int  a){
// return product quantity ;

// }
// public void  setprice(){
// productprice=price;}
// public int getprice(int a){
// return product price ;

// }
// public void  setcategory(){
// productcategory=category;}
// public String getcategory(String a){
// return product category ;

// }
// public void  setid(){
// productid=id;}
// public String getid(String a){
// return product id ;

// }


 













}