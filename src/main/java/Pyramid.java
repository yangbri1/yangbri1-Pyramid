
public class Pyramid {
    /**
     * TODO: Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
     * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
     * current 'row'.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        // declare empty String to concatenate * to & later return
        String emptyStr = "";

        // iterator for outer flow control while loop (each row)
        int rowNum = 0;
        // iterate to create each row
        while(rowNum < n){
            // iterator for each row elem
            // int wildcard = n - 1;
            // while(wildcard < n){
            //     // System.out.print('*');
            //     emptyStr += "*";
            //     ++wildcard;
            // }
            emptyStr += ('*' * 5);
            // System.out.println();
            emptyStr += "\n";
            ++rowNum;
        }

        return emptyStr;
    }
}
