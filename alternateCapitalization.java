public class alternateCapitalization {
    class Solution{
        public static String[] capitalize (String s){
          // Gorillaz - Do Ya Thing (2010)
          String str1 = "";
          String str2 = "";
          boolean cap = true;
          for(int i=0; i<s.length(); i++){
            if (cap == true){
              str1 += s.substring(i, i+1).toUpperCase();
              str2 += s.substring(i, i+1);
              cap = false;
            }else{
              str1 += s.substring(i, i+1);
              str2 += s.substring(i, i+1).toUpperCase();
              cap = true;
            }
          }
          
          return new String[] {str1,str2};
        }
    }
}
