import creators.FabricaCafe;
import creators.FabricaCha;

public class Main {
    public static void main(String[] args) {
        //instâncias das fábricas:
        // FabricaCafe
        FabricaCafe cafe = new FabricaCafe();
        cafe.criarBebida().preparar();
        //FabricaCha
        FabricaCha cha = new FabricaCha();
        cha.criarBebida().preparar();
    }
}