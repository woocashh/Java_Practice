public class client {


  private static boolean isPalindrome(String str){
    int len = str.length();
    if(len <= 1){
      return true;
    }
    else if(str.charAt(0) == str.charAt(len - 1)){
      return isPalindrome(str.substring(1,len-1));
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
    int current;

    for(int i = 0; i < 1500; i++){
      current = i*i*i;
      if(isPalindrome(Integer.toString(current))){
        System.out.println(current);
      }
    }
  }

}
