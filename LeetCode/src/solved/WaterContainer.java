class WaterContainer {
	public int solution(int [] h){
		int area = 0, i=0, j = h.length -1;
		while(i < j) {
			int width = j -i;
			int height = h[i] <= h[j] ? h[i++] : h[j--];
			int currarea = width * height;
			
			if(currarea > area) {
				area = currarea;
			}
			
		}
		return area;
	}
	
	public static void main(String [] args) {
		WaterContainer wcon = new WaterContainer();
		int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7}; 
		System.out.println(wcon.solution(arr));
	}
}