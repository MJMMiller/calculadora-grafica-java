package ec.ups.edu.poo.controlador;

import ec.ups.edu.poo.modelo.Calculadora;
import ec.ups.edu.poo.vista.CalculadoraVista;


import java.awt.*;
import java.awt.event.*;

public class CalculadoraController implements ActionListener, WindowListener {

    private CalculadoraVista calculdoraVista;
    private Calculadora calculadora;

    public CalculadoraController(CalculadoraVista calculdoraVista, Calculadora calculadora) {
        this.calculdoraVista = calculdoraVista;
        this.calculadora = calculadora;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
