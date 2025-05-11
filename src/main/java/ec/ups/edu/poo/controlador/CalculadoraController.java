package ec.ups.edu.poo.controlador;

import ec.ups.edu.poo.modelo.Calculadora;
import ec.ups.edu.poo.vista.CalculadoraView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private CalculadoraView vista;
    private Calculadora modelo;

    public CalculadoraController(CalculadoraView vista, Calculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
        agregarEventos();
    }

    private void agregarEventos() {
        vista.botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(vista.tf1.getText());
                double num2 = Double.parseDouble(vista.tf2.getText());

                modelo.setValor1(num1);
                modelo.setValor2(num2);

                double resultado = 0;

                if (vista.checkboxSuma.getState()) {
                    resultado = modelo.sumar();
                } else if (vista.checkboxResta.getState()) {
                    resultado = modelo.restar();
                } else if (vista.checkboxMultiplicar.getState()) {
                    resultado = modelo.multiplicar();
                } else if (vista.checkboxDivision.getState()) {
                    if (num2 != 0) {
                        resultado = modelo.dividir();
                    } else {
                        vista.tfresultado.setText("Error");
                        return;
                    }
                }

                vista.tfresultado.setText(String.valueOf(resultado));
            }
        });

        vista.botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.tf1.setText("0.00");
                vista.tf2.setText("0.00");
                vista.tfresultado.setText("0.00");
                vista.checkboxSuma.setState(false);
                vista.checkboxResta.setState(false);
                vista.checkboxMultiplicar.setState(false);
                vista.checkboxDivision.setState(false);
            }
        });
    }
}