package stringcalculator; 

public class Calculator{
    public static int add(String args){
		int sum = 0;
		String numbers[] = args.split(",|\n");

	 	if(args == ""){
			return 0;
		}
		else if(args != "")
		{
		    for(String n : numbers)
		      sum += Integer.parseInt(n);
		    
		    return sum;
		}
		else
			return -1;
    }
}