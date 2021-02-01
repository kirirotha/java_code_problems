import java.util.Arrays;

public class AthleticStatistics {

        
  public static String stat(String strg) {
    // your code
    System.out.println(strg +"    OG");
    if(strg == ""){return "";}
    String[] times = strg.split(",");
    int[] seconds = new int[times.length];
    for(int i=0; i < times.length; i++){
      seconds[i] = 0;
      String[] time = times[i].split("\\|");
      for(int j = 0; j<time.length ; j++){
//         System.out.println(Integer.parseInt(time[j].trim())*Math.pow(60, (2-j)) + "seconds");
        seconds[i] += Integer.parseInt(time[j].trim())*Math.pow(60, (2-j));
      }
//       System.out.println(seconds[i]);
    }
    
    int range = range(seconds);
    int average = average(seconds);
    int median = median(seconds);
    
    return "Range: " + formatTime(range) + " Average: " + formatTime(average) + " Median: " + formatTime(median);
  }
  
  public static int range(int[] seconds){
    int min = seconds[0];
    int max = seconds[0];
    for(int i=0; i<seconds.length; i++){
      if(seconds[i] < min){
        min = seconds[i];
      }
      if(seconds[i] > max){
        max = seconds[i]; 
      }
    }
    
    return max-min;
  }
  
  public static int average(int[] seconds){
    int total = 0;
    for(int i=0; i<seconds.length; i++){
      total +=seconds[i];
    }
    return total/seconds.length;
  }
  
  public static int median(int[] seconds){
    Arrays.sort(seconds);
    for(int i=0; i<seconds.length; i++){
          System.out.println(seconds[i]);
    }
    if(seconds.length%2 == 1){
      return seconds[seconds.length/2];
    }else{
      return (seconds[seconds.length/2-1] + seconds[seconds.length/2])/2;
    }
  }
  
  public static String formatTime(int totalSeconds){
    int hours = totalSeconds/3600;
    int minutes = (totalSeconds%3600)/60;
    int second = (totalSeconds%3600)%60;
    
//     return (hours<10 ? "0"+ hours : hours) + '|' + (minutes<10 ? "0"+ minutes : minutes) + '|' + (second<10 ? "0"+ second : second);
    return String.join("|", String.valueOf(hours<10 ? "0"+ hours : hours), String.valueOf(minutes<10 ? "0"+ minutes : minutes), String.valueOf(second<10 ? "0"+ second : second));

  }
}
  

