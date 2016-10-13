package stringcalculator; 

public class Calculator{
    public static int add(String args){
		StringBuilder sb = new StringBuilder(args);
		int sum = 0, index1 = 0, index2 = 0;

	 	if(args == ""){
			return 0;
		}
		else if(args != "")
		{
			index2 = sb.indexOf(",");

			while(index2 != -1)
			{
				sum += Integer.parseInt(sb.substring(index1, index2));
				index1 = index2+1;
				index2 = sb.indexOf(",", index1);
			}

			index2 = sb.length();
			sum += Integer.parseInt(sb.substring(index1, index2));
			return sum;
		}
		else
			return -1;
    }
}