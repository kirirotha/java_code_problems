public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
	    // your code
      int result = 0;
      if(h<=window || bounce >= 1 || bounce < 0){
        return -1;
      }
    
      if(h*bounce < window){
        result =1 ;
      }else{
        while( h > window){
          result +=2;
          h *= bounce;
        }
        result -=1;
      }
    return result;
	}
}
