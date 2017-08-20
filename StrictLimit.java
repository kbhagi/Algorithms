class StrictLimit {
public static void main(String[] args) {
      if(args.length < 2)
	 System.out.println("Must pass 2 double arguments");
      else {
         double d1 = Double.parseDouble(args[0]);
         double d2 = Double.parseDouble(args[1]);
         System.out.println(d1 > 0 && d1 < 1 &&  d2 > 0 && d2 < 1 );
      }
  }
  }
