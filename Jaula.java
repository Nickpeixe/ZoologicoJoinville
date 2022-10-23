import java.util.ArrayList;

public class Jaula {
    int id;
    String nome;
    String tipo;
    Limpeza limpeza;
    Ave ave;
    Mamifero mamifero;
    Repteis repteis;
    private ArrayList<Limpeza> limps;
    

   public static ArrayList <Jaula> monstro = new ArrayList<>();
    Jaula(int id, String nome, String tipo,Limpeza limpeza, Ave ave, Mamifero mamifero, Repteis repteis ){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.limpeza = limpeza;
        this.ave = ave;
        this.mamifero = mamifero;
        this.repteis = repteis; 
        monstro.add(this);
    }
    public static Jaula verificaId(int id) throws Exception{
        for(Jaula jaula: monstro){
            if(jaula.id == id)
            return jaula;
        }throw new Exception("Jaula Não Encontrada!!!!");
    }
}