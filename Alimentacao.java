import java.util.ArrayList;

public class Alimentacao extends Generico {

    ArrayList <Alimentacao> food = new ArrayList<>();
    Alimentacao(int id, String data, String descricao){
        super(id,data,descricao);
        food.add(this);
    }
}
