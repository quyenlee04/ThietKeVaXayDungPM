import Entity.AbstractCalculateEntity;

class AddUseCaseControl {
    private AbstractCalculateEntity addEntity = null;
    private AbstractCalculateEntity subEntity = null;
    private AbstractCalculateEntity mulEntity = null;
    private AbstractCalculateEntity divEntity = null;
    private AddUIConsoleOutput addOut = null;

   
    public AddUseCaseControl(AddUIConsoleOutput addOut, AbstractCalculateEntity addEntity, AbstractCalculateEntity subEntity, AbstractCalculateEntity mulEntity, AbstractCalculateEntity divEntity) {
        this.addEntity = addEntity;
        this.subEntity = subEntity;
        this.mulEntity = mulEntity;
        this.divEntity = divEntity;
        this.addOut = addOut;
    }

  
    public void execute(RequestData requestData) throws Exception {
        int num1 = 0;
        int num2 = 0;

        boolean validInput = false;
    while (!validInput) {
        try {
            num1 = Integer.parseInt(requestData.getNum1());
            num2 = Integer.parseInt(requestData.getNum2());
            validInput = true; 
        } catch (NumberFormatException e) {
            System.out.println("Error parsing. Please enter valid numbers.");
            requestData.setNum1(new java.util.Scanner(System.in).nextLine());
            requestData.setNum2(new java.util.Scanner(System.in).nextLine());
        }
    }
    
        
        

    String addResult = String.valueOf(this.addEntity.calculate(num1, num2));
    String subResult = String.valueOf(this.subEntity.calculate(num1, num2));
    String mulResult = String.valueOf(this.mulEntity.calculate(num1, num2));
    String divResult = String.valueOf(this.divEntity.calculate(num1, num2));

        
        ResponseData responseData = new ResponseData();
        responseData.setAddResult(addResult);
        responseData.setSubResult(subResult);
        responseData.setMulResult(mulResult);
        responseData.setDivResult(divResult);

        this.addOut.output(responseData);

    }
}