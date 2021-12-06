import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Directory{

    private void findFile()
    {
        File file = new File("C:\\Users\\cakhi\\OneDrive\\Documents\\placements");
        String pattern ;
        Scanner sc = new Scanner(System.in);
        do{
            int flag =0;
            System.out.println("Enter the regular Expression:");
            pattern =sc.nextLine();
            String[] files = file.list();
            for (String string : files){
                if (Pattern.matches(pattern,string)){
                    flag = 1;
                    System.out.println("Path : "+ file.getAbsolutePath() + string);
                }
            }
            if(flag == 0)
            {
                System.out.println("Pattern not matched : Reenter the pattern correctly");
            }
        } while(true);
    }
    public static void main(String[] args){
        Directory obj =new Directory();
        obj.findFile();
    }
}