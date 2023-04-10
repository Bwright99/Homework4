import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }

    public boolean isJava(List<String> tokens) {
        if (tokens == null || tokens.isEmpty()) {
            return false;
        }

        String firstToken = tokens.get(0);

        if (isToken(firstToken)) {
            List<String> remainingTokens = tokens.subList(1, tokens.size());
            return isJava(remainingTokens);
        } else {
            return false;
        }
    }

    /**
     * Checks if the given token is a Java keyword.
     *
     * @param token The token to be checked
     * @return true if the token is a Java keyword, false otherwise
     */
    private boolean isToken(String token) {
        String[] tokens = {"while", "if", "{", "}", "+", "-", "*", "/", "(", ")", " > ", " < ", " == ", " != ", " && ", " ||"};

        for (String keyword : tokens) {
            if (keyword.equals(token)) {
                return true;
            }
        }

        return false;
    }

}