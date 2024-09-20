import Entity.AddEntity;
import Entity.DivEntity;
import Entity.MulEntity;
import Entity.SubEntity;

public class App {
    public static void main(String[] args) throws Exception {
        AddEntity addEntity = new AddEntity();
        SubEntity subEntity = new SubEntity();
        MulEntity mulEntity = new MulEntity();
        DivEntity divEntity = new DivEntity();

        AddUIConsoleOutput output = new AddUIConsoleOutput();
        AddUseCaseControl control = new AddUseCaseControl(output,addEntity,subEntity, mulEntity,divEntity);
        AddUIConsoleInput input = new AddUIConsoleInput(control);

        input.input();
    }
}
