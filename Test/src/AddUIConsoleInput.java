import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddUIConsoleInput {
    private InputBoundary addControl = null;
    private BufferedReader input= null;


    public AddUIConsoleInput (InputBoundary addControl){
        this.addControl = addControl;
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public void input() throws Exception{
        RequestData requestData = new RequestData();
        System.out.print("Enter num1: ");
        requestData.setNum1(input.readLine());
        System.out.print("Enter num2: ");
        requestData.setNum2(input.readLine());
        
        
        addControl.execute(requestData);
}
}
