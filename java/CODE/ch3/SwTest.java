class SwTest {
public static void main(String[] args)	{

	switch(args[0])
	{
		case "Java":
			System.out.println("U have selected Java");
		    break;
		case "PHP" :
			System.out.println("U have selected PHP");
		    break;
		case "DotNet":
			System.out.println("U have Selected DotNet");
		    break;
		default :
			System.out.println("Selected course does not match the expression");
    	} //end of switch
	
	}//end of main
}//end of class