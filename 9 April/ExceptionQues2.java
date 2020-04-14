import java.io.FileNotFoundException;
 
public class ExceptionQues2 {
        ExceptionQues2(String msg) {
        msg = "this is to execute";
        System.out.println(msg);
    }
 
    public static void main(String[] args) throws Exception {
        try {
            
            throw new FileNotFoundException();
        } 

        catch (FileNotFoundException e)

         {
            throw new Exception("File not found");
        } 

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

         finally {
           
            System.out.println("i will get printed");
        }
 
    }
}
