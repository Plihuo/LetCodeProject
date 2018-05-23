
public class LetCode {
    public static int[][] flipAndInvertImage(int[][] data) {
    	if(1 > data.length||data[0].length > 20) {
    		return null;
    	}
    	int[][] result = new int[data.length][];
        for(int i = 0;i<data.length;i++) { 
        	result[i] = new int[data[i].length];
        	for(int j = (result[i].length-1);j>=0;j--) {
        		if(data[i][j]>=0&&data[i][j]<=1) {
        			result[i][(result[i].length-1)-j] = (data[i][j]==1)?0:1;
        		}else {
        			return null;
        		}
        	}
        }
        return result;
    }
    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        for(int i = 0;i<sources.length;i++) {
        	if(indexes[i+1]<sources[i].length()) {
        		return null;
        	}
        	for(int j = 0;j<sources[i].length();j++) {
        		if(S.charAt(indexes[i])==sources[i].charAt(i)) {
        			continue;
        		}
        	}
        }
    	return S;
    }
}
