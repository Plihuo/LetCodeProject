
public class LauncherMain {

	public static void main(String[] args) {
		int[][] data = new int[][]{
			{1,1,0},
			{1,0,1},
			{0,0,0}};
			int[][] result = LetCode.flipAndInvertImage(data);
			System.out.print("[");
			for(int i = 0;i<result.length;i++) {
				System.out.print("[");
	        	for(int j = 0;j<result[i].length;j++) {
	        		System.out.print(result[i][j]);
	        		if(j<(result[i].length-1)) {
	        			System.out.print(",");
	        		}
	        	}
	        	System.out.print("]");
	        }
			System.out.print("]");
	}
}
