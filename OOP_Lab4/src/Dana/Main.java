package Dana;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Arrays;
import java.util.List;

import static Dana.CheckParantheses.areParenthesisBalanced;

public class Main {
  //  static String content ;
  //  List<String> lines;
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\danna\\Desktop\\one_expression.txt"));
        System.out.println(lines);
//
//        content = new String(Files.readAllBytes(Paths.get("C:\\Users\\danna\\Desktop\\one_expression.txt")));
//        System.out.println(Arrays.toString(exp));
//         char exp =content.toCharArray();


         char[]  exp =lines.toString().toCharArray();
        if(areParenthesisBalanced(exp))
            System.out.println("The expression is correct!");
        else System.out.println("The expression is not correct!");
    }
}

