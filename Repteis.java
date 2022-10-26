import java.util.ArrayList;
public class Repteis extends Animais{
    String habitat;
    Alimentacao  alimentacao;// chamando as classes para fazer a ligação

   public static ArrayList <Repteis> dinossauro = new ArrayList<>();
    Repteis(int id, String nome, String especie, String habitat, Alimentacao  alimentacao){
        super(id,nome,especie);
        this.habitat = habitat;
        this.alimentacao = alimentacao;
        dinossauro.add(this);
    }
    public String getRepteis(){
        return habitat;
    }
    public void setRepteis(String habitat){
        this.habitat = habitat;
    }

    public static Repteis verificaId(int id) throws Exception{
        for(Repteis repteis: dinossauro){
            if(repteis.id == id)
                return repteis;

        }
        throw new Exception("Reptil não Encontrado!!!!!");

    }

}