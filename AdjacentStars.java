public class AdjacentStars{
	static String output="";
static void pairStar(String input,int i)
{
	output = output + input.charAt(i);

	if (i == input.length()- 1)
		return;

	
	if (input.charAt(i) == input.charAt(i+1))
		output = output + '*';	

	pairStar(input, i+1);
}

// Driver code
public static void main(String[] args)
{
	String input = "geekssbaa";
	pairStar(input,0);
	System.out.println(output);
}
}

