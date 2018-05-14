package prueba.celulares;

import ico.fes.Mobile.Mobile;

public class Iphone implements Mobile {

    private int ramSize;
    private String procesador, GPU;

    public Iphone(int ramSize, String procesador, String GPU) {
        this.ramSize = ramSize;
        this.procesador = procesador;
        this.GPU = GPU;
    }

}
