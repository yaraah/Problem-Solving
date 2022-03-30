/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        String ZooWord=Zoos(name);
        System.out.println(ZooWord);    // Writing output to STDOUT

        

        // Write your code here

    }
        public static String Zoos(String word)
    {
         int Zcount=0;
        int Ocount=0;
        int ErrorCount=0;
        if(word.length()<=20&&(word.charAt(0)=='z'||word.charAt(0)=='Z')){
        for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
       if(ch=='z'||ch=='Z'||ch=='o'||ch=='O'){
        if(ch=='z'||ch=='Z')
            Zcount++;
        else if(ch=='o'||ch=='O')
            Ocount++;
        }else
        { ErrorCount++;}
        }    
        if(2*Zcount==Ocount&&Zcount!=0&&Ocount!=0&&ErrorCount==0)
           return "Yes";
        }
        return "No";
    } 
}
