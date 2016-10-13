package stringcalculator; 

public class Calculator{
    public static int add(String args){
		StringBuilder sb = new StringBuilder(args);

	 	if(args == "")
			return 0;
		else
			return -1;
    }
}