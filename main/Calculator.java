package stringcalculator; 

public class Calculator{
    public static int add(String args){
	 	if(args == "")
			return 0;
		else if(args != "")
		{
			int sum = 0, num = 0;
			String numbers[];
			
			if(args.charAt(0) == '/' && args.charAt(1) == '/')
			{
				String delimiter[] = args.split("//|\n", 3);
				numbers = delimiter[2].split(delimiter[1] + "|,|\n");
			}
			else
				numbers = args.split(",|\n");

		    for(int i = 0; i < numbers.length; i++)
		    {
		    	num = Integer.parseInt(numbers[i]);
		    	if(num < 0)
		    		negativeFound(numbers, i);
		    	else if(num <= 1000)
		    		sum += num;
		  	}
		    
		    return sum;
		}
		else
			return -1;
    }

    public static void negativeFound(String[] numbers, int index){
    	String negativeNumbers = "Negatives not allowed: " + numbers[index];
    	int num = 0;

    	for(int i = index + 1; i < numbers.length; i++)
	    {
	    	num = Integer.parseInt(numbers[i]);
	    	if(num < 0)
	    		negativeNumbers += "," + num; 
	  	}

	  	throw new IllegalArgumentException(negativeNumbers);
    }
}