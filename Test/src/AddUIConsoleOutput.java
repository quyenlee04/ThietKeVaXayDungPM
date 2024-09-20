import java.io.PrintWriter;

public class AddUIConsoleOutput {

    private PrintWriter stdOut= null;

    
    public AddUIConsoleOutput() {
        this.stdOut = new PrintWriter(System.out, true);
    }

    
    public void output(ResponseData responseData) {
        stdOut.println("Addition Result: " + responseData.getAddResult());
        stdOut.println("Subtraction Result: " + responseData.getSubResult());
        stdOut.println("Multiplication Result: " + responseData.getMulResult());
        stdOut.println("Division Result: " + responseData.getDivResult());
    }
    }

