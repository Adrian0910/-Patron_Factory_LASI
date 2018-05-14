package prueba.celulares;

import ico.fes.Mobile.Mobile;

public class Sony implements Mobile {

    private int ramSize;
    private String procesador, GPU;

    public Sony(int ramSize, String procesador, String GPU) {
        this.ramSize = ramSize;
        this.procesador = procesador;
        this.GPU = GPU;
    }

}
