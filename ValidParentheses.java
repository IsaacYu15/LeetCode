// 80/95 test cases. 
//LOOK INTO STACKS

public class ValidParentheses {
    public boolean isValid(String s) {

        int[] markers = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == '(' && s.charAt(j) == ')' ||
                        s.charAt(i) == '[' && s.charAt(j) == ']' ||
                        s.charAt(i) == '{' && s.charAt(j) == '}') {

                    if (markers[j] == 0 && markers[i] == 0) {

                        markers[i] = 1;
                        markers[j] = 1;

                        for (int k = i + 1; k < j; k++) {
                            if (markers[k] == 1) {
                                System.out.println("za");
                                return false;
                            }
                        }
                    }

                }

            }
        }

        for (int i = 0; i < markers.length; i++) {
            if (markers[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
