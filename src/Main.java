import java.util.List;

public class Main {
    public static void main(String[] args) {

        BasicStructure audi =new BasicStructure();
        audi.color="balck";
        audi.model="A3";
        audi.power="5000cc";

        Engine eng=new Engine();
        eng.cylinders="8";
        eng.size="1234re";
        eng.weight="6347K";


        Color col= new Color();
        col.colorLights="True";
        col.colorTyre="false";
        col.colorWindows="True";

        Lights lt=new Lights();
        lt.color="red";
        lt.intensity="bright";
                lt.size="middle";



    }
}