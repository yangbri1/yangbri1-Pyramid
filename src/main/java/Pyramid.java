
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
        // iterate to create each row -- upperbound set to (n+1) to account for last row -- otw DN hit
        while(rowNum < n + 1){
            // iterator for each row elem
            int wildcard = 0;
            // this condition so each row only contains asterisk equal to 'rowNum'
            while(wildcard < rowNum){
                // System.out.print('*');
                // use addition assignment operator '+=' to recursively add on wildcard/asterisks to empty String
                emptyStr += "*";
                // increment to continue loop
                ++wildcard;
            }
            
            // System.out.println();
            // append newline '\n' character for line break onto next row
            emptyStr += "\n";
            // increment by 1to move to next row
            ++rowNum;
        }

        return emptyStr;
    }
}
