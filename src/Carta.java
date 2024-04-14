    enum Numero {
    AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5),//Constantes y valores asociados
    SEIS(6), SIETE(7), SOTA(10), CABALLO(11), REY(12);
    private final int valor1; //Variable atributo para guardar el valor entero asociado
    private Numero (int valor) {
        this.valor1 = valor;
    } 
    public int getValor() { //Para poder ver el valor
        return valor1;
    }    
}
    
    enum Palo {
        ORO(1,"GOLD"), COPA(10,"CUP"), ESPADA(100,"SPADE"), BASTO(1000,"CLUB");
        private int valor2;
        private String english;
        private Palo(int numero, String english){
            this.valor2 = numero;
            this.english = english;
        }        

    public int getValor2() {
        return valor2;
    }

    public String getEnglish() {
        return english;
    }          
}

public class Carta {  
    
    private final Palo palo;
    private final Numero numero;

    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + "de" + palo;
    }
    
    
    
 }

