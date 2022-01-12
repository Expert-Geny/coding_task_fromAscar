package tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {

        if (str.length() != 0) {
            System.out.println("Length of the last word is " + (str.length() - str.lastIndexOf(' ') - 1));
        }

        return 0;
    }

    public static void main(String[] args){
        Task1 task1 = new Task1();
        task1.lengthOfLastWord("Hello World, Hello Ganisher");
        System.out.println(task1);
    }

}
