public class RemoveDuplicateFromString1 {
  public String removeDuplicate(String str) {

    String result = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      boolean isDuplicate = false;

      for (int j = 0; j < result.length(); j++) {
        if (ch == result.charAt(j)) {
          isDuplicate = true;
          break;
        }
      }
      if (isDuplicate == false) {
        result = result + ch;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String str = "aabbccabc";
    RemoveDuplicateFromString1 rtn = new RemoveDuplicateFromString1();
    String res = rtn.removeDuplicate(str);
    System.out.println(res);
  }
}