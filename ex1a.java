public class ex1a {

  public static void main(String[] args) {
      if(args.length < 3)
	  System.out.println("Must pass 3 integer arguments");
      else {
         int n1 = Integer.parseInt(args[0]);
         int n2 = Integer.parseInt(args[1]);
         int n3 = Integer.parseInt(args[2]);
        System.out.println( n1 == n2 && n2 == n3 ? "equal" : "not equal");
      }
  }
}
