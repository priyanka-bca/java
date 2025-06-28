public class Overloading {

  public int sum(int x, int y){
  return x+y;
}
public int sum(int x, int y , int z){
  return x*y*z;
}
public static void main(String[] args) {
   Overloading s = new Overloading();
  System.out.println(s.sum(5,8));
  System.out.println(s.sum(3,5));
}
}

