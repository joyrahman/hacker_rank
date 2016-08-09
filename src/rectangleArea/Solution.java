package rectangleArea;

public class Solution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		// do something
		int area = (C - A) * (D - B) + (G - E) * (H - F);
		if (C < E || G < A)
			return area;
		if (D < F || H < B)
			return area;

		int right = Math.min(C, G);
		int left = Math.max(A, E);
		int top = Math.min(D, H);
		int bottom = Math.max(B, F);
		return area - (right - left) * (top - bottom);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int A = -3;
		int B = 0;
		int C = 3;
		int D = 4;
		int E = 0;
		int F = -1;
		int G = 9;
		int H = 2;
				
				
		int result = s.computeArea(A, B, C, D, E, F, G, H);
		System.out.println(result);

	}

}
