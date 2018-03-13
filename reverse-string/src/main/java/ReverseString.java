class ReverseString {

    String reverse(String inputString) {
            String outputString = "";
            for (int i = inputString.length() - 1 ; i >= 0 ; i--) {
                String str = String.valueOf(inputString.charAt(i));
                outputString = outputString.concat(str);
            }
            return outputString;
    }
  
}