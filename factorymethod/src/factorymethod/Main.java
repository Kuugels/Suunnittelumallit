package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus rehtori = new Rehtori();
        
        oppilas.aterioi();
        System.out.println("");
        
        opettaja.aterioi();
        System.out.println("");
        
        rehtori.aterioi();
    }
}
