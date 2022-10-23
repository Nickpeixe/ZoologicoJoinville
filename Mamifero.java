import java.util.ArrayList;


public class Mamifero extends Animais{
    int tempgest;
    Alimentacao  alimentacao;

    public static ArrayList <Mamifero> mamiro = new ArrayList<>();
    Mamifero(int id, String nome, String especie, int tempgest, Alimentacao  alimentacao){
        super(id,nome,especie);
        this.tempgest = tempgest;
        this.alimentacao = alimentacao;
        mamiro.add(this);
    }

    public int getMamifero(){
        return tempgest;
    }
    public void setMamifero(int tempgest){
        this.tempgest = tempgest;
    }
    public static Mamifero verificaId(int id) throws Exception {
        for (Mamifero mamifero : mamiro ) {
            if (mamifero.id == id) {
                return mamifero;
            }
        }
  
        throw new Exception("Mamifero não encontrado");
    } 
}
