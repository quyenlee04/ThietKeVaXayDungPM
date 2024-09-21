import Entity.AddEntity;
import Entity.DivEntity;
import Entity.MulEntity;
import Entity.SubEntity;

class AddUseCaseControl {
    private AddEntity addEntity = null;
    private SubEntity subEntity = null;
    private MulEntity mulEntity = null;
    private DivEntity divEntity = null;
    private AddUIConsoleOutput addOut = null;

   
    public AddUseCaseControl(AddUIConsoleOutput addOut, AddEntity addEntity, SubEntity subEntity, MulEntity mulEntity, DivEntity divEntity) {
        this.addEntity = addEntity;
        this.subEntity = subEntity;
        this.mulEntity = mulEntity;
        this.divEntity = divEntity;
        this.addOut = addOut;
    }

  
    public void execute(RequestData requestData) throws Exception {
        int num1 = 0;
        int num2 = 0;

        try {
            num1 = Integer.parseInt(requestData.getNum1());
            num2 = Integer.parseInt(requestData.getNum2());
        } catch (Exception e) {
            throw new Exception("so nhap vao khong hop le");
            
        }
    
        this.addEntity.setNum1(num1);
        this.addEntity.setNum2(num2);

        this.subEntity.setNum1(num1);
        this.subEntity.setNum2(num2);

        this.mulEntity.setNum1(num1);
        this.mulEntity.setNum2(num2);

        this.divEntity.setNum1(num1);
        this.divEntity.setNum2(num2);
        

        String addResult = String.valueOf(this.addEntity.add());
        String subResult = String.valueOf(this.subEntity.sub());
        String mulResult = String.valueOf(this.mulEntity.mul());
        String divResult = String.valueOf(this.divEntity.div());
        
        ResponseData responseData = new ResponseData();
        responseData.setAddResult(addResult);
        responseData.setSubResult(subResult);
        responseData.setMulResult(mulResult);
        responseData.setDivResult(divResult);

        this.addOut.output(responseData);

    }
}