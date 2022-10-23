import java.util.ArrayList;

public class Limpeza extends Generico{

 public static  ArrayList <Limpeza> limps = new ArrayList<>();

    Limpeza(int id, String data, String descricao){
        super(id,data,descricao); 
        limps.add(this);        
    }
public static Limpeza verificaId(int id) throws Exception{
    for(Limpeza limpeza: limps){
        if(limpeza.id == id)
        return limpeza;
    }throw new Exception("Limpeza não encontrado!!!");
}

}
