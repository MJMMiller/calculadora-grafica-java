package ec.ups.edu.poo;

import ec.ups.edu.poo.vista.CalculadoraView;
import ec.ups.edu.poo.modelo.Calculadora;
import ec.ups.edu.poo.controlador.CalculadoraController;

public class Principal {
    public static void main(String[] args) {
        CalculadoraView vista = new CalculadoraView();
        Calculadora modelo = new Calculadora();
        new CalculadoraController(vista, modelo);
    }
}
