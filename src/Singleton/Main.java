package Singleton;

import Singleton.Paises;

public class Main {

    public static void main(String[] args){

        //Singleton
        Paises paises = Paises.getInstance();
        paises.listaPaises();

    }
}
