/*
 * Author: Meta @ vidasConcurrentes
 * Related to: http://vidasconcurrentes.blogspot.com/2011/06/distancia-de-levenshtein-distancia-de.html
 *
 * This is the class which implements the Weighted Levenshtein Distance
 * To do so, we take the base algorithm and make some modifications, as follows:
 * 		·	multiply first column for the Delete weight
 * 		·	multiply first row for the Insert weight
 * 		·	add the Delete weight when checking for the [i-1][j] value
 * 		·	add the Insert weight when checking for the [i][j-1] value
 * 		·	make the substitution cost the Substitution weight
 */
public class WeightedLevenshteinDistance {

	private static int minimum(int a, int b, int c) {
		if(a <= b && a <= c)
			return a;
		if(b <= a && b <= c)
			return b;
		return c;
	}

	public static int computeLevenshteinDistance(String str1, String str2, int add, int delete, int substitute) {
		return computeLevenshteinDistance(str1.toCharArray(), str2.toCharArray(), add, delete, substitute);
	}

	private static int computeLevenshteinDistance(char [] str1, char [] str2, int insert, int delete, int substitute) {
		int [][]distance = new int[str1.length+1][str2.length+1];

		for(int i = 0; i <= str1.length; i++)
			distance[i][0] = i * delete;	// non-weighted algorithm doesn't take Delete weight into account
		for(int j = 0; j <= str2.length; j++)
			distance[0][j] = j * insert;	// non-weighted algorithm doesn't take Insert weight into account
		for(int i = 1; i <= str1.length; i++)
		{
			for(int j = 1; j <= str2.length; j++)
			{ 
				distance[i][j]= minimum(distance[i-1][j] + delete,	// would be +1 instead of +delete
						distance[i][j-1] + insert,					// would be +1 instead of +insert
						distance[i-1][j-1] + ((str1[i-1] == str2[j-1]) ? 0 : substitute));	// would be 1 instead of substitute
			}
		}
		return distance[str1.length][str2.length];
	}
}