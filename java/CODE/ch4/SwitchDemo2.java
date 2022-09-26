class  SwitchDemo2{
public static void  main(String args[]) {
  String str="software";
    switch(str) {
       default:
	    System.out.println("Invalid choice");
	   break;
	  case "ssi":
        System.out.println("Training");
        break;
      case "capgemini":
        System.out.println("Development");
        break;
      case "tcs":
     System.out.println("Consultant");
        break;
      case "software":
        System.out.println("A software product");
        break;
    }
  }
}