package solved;

class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n<1) {
        	return false;
        }
        
        while(n%3 == 0) {
        	n= n/3;
        }
    	return n == 1;
    }
    public static void main(String [] args) {
    	PowerOfThree powerOfThree = new PowerOfThree();
    	System.out.println(powerOfThree.isPowerOfThree(45));
    }
}