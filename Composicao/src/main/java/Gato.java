import comportamentos.Andar;
import comportamentos.Dormir;
import comportamentos.Falar;

public class Gato extends Animal {
    private Andar andar;
    private Dormir dormir;
    private Falar falar;

    public Gato(String nome, int idade, String categoria) {
        super(nome, idade, categoria);

        Andar andar = new Andar();
        Falar falar = new Falar();
        Dormir dormir = new Dormir();
    }

    public void andar(){
        this.andar.andar(10);
    }

    public void falar(){
        this.falar.falar("meowwwwwwww");
    }

    public void dormir(){
        this.dormir.dormir();
    }
}
