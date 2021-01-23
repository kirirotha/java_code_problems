public class countingDuplicates {
    public static int duplicateCount(String text) {
      // Write your code here
      int dupes = 0;
      String letters = "";
      for(int i=0; i<text.length()-1; i++){
        int count = 0;
        for(int j=i+1; j< text.length(); j++){
          if(text.substring(i,i+1).toLowerCase().equals(text.substring(j,j+1).toLowerCase())){
            count++;
            text = text.substring(0,j) + text.substring(j+1, text.length());
            j--;
          }   
        }
       if(count>0){
          dupes ++;
        }
      }
      return dupes;
    }
  }