package Entity;

public class DivEntity {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1= num1;
    }

    public void setNum2(int num2){
        this.num2= num2;
    }

    public int div(){
        return num1*num2;
    }

}
