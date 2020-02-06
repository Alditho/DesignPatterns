package Singleton;

public class Paises {

    private static Paises instance;

    private Paises() {}

    public static Paises getInstance() {

        if(instance==null){
            instance = new Paises();
        }

        return  instance;
    }

    public void listaPaises(){
        System.out.println("tu lista de paises");
    }
}
