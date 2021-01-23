public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
      for(int i=0; i<str.length()-1; i++){
        for(int j=i+1; j<str.length(); j++){
          if(str.substring(i, i+1).toLowerCase().equals(str.substring(j, j+1).toLowerCase())){
            return false;
          }
        }
      }
      return true;
    } 
}