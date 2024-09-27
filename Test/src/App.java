import Entity.AbstractCalculateEntity;
import Entity.AddEntity;
import Entity.DivEntity;
import Entity.MulEntity;
import Entity.SubEntity;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractCalculateEntity addEntity = new AddEntity();
        AbstractCalculateEntity subEntity = new SubEntity();
        AbstractCalculateEntity mulEntity = new MulEntity();
        AbstractCalculateEntity divEntity = new DivEntity();

        AddUIConsoleOutput output = new AddUIConsoleOutput();
        AddUseCaseControl control = new AddUseCaseControl(output,addEntity,subEntity, mulEntity,divEntity);
        AddUIConsoleInput input = new AddUIConsoleInput(control);

        input.input();
    }
}
