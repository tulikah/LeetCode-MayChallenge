package mayChallenge;

public class CheckIfStraightLine {

	public static void main(String[] args) {
		boolean ans = true;
		double slope = 0;
		int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		// TODO Auto-generated method stub
		if(coordinates == null) {
			return;
		}
		
		double x1 = coordinates[0][0];
		double y1 = coordinates[0][1];
		
		for(int i = 1; i<coordinates.length; i++) {
			
			double x2 = coordinates[i][0];
			double y2 = coordinates[i][1];
			
			if(x2 - x1 == 0) return;
			
			if(slope == 0) {
				slope = (y2-y1)/(x2-x1);
				
			}
			
			double slope2 = (y2-y1)/(x2-x1);
			
			if(slope != slope2)
				ans = false ;
			
		}
		System.out.println(ans);
	}

}
