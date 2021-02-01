class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        // your code
      if(strarr.length == 0 || k > strarr.length || k <= 0){
        return "";
      }
      String longest = "";
      for(int i=0; i<strarr.length-k+1; i++){
        System.out.println(strarr[i]);
        String word = strarr[i];
        for(int j=1; j<k; j++){
          word += strarr[i+j];
        }
        if(word.length() > longest.length()){
          longest = word;
        }
      }
      return longest;
    }
}

/* Here is a comment **** */
/* This is also a comment /* More comments */ */
/* This is also a comment // More comments */
// /* This is a // // comment */