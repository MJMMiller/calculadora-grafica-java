package ec.ups.edu.poo.vista;

import java.awt.*;

public class CalculadoraView extends Frame {
    public TextField tf1, tf2, tfresultado;
    public Checkbox checkboxSuma, checkboxResta, checkboxMultiplicar, checkboxDivision;
    public Button botonCalcular, botonLimpiar;

    public CalculadoraView() {
        setTitle("Calculadora del Sábado");
        setSize(400, 300);
        setLocationRelativeTo(null);

        Panel panelGeneral = new Panel(new BorderLayout());
        Panel panelSuperior = new Panel(new GridLayout(3, 2));
        Panel panelIntermedio = new Panel(new GridLayout(2, 2));
        Panel panelInferior = new Panel(new GridLayout(1, 2));

        Label label1 = new Label("Número 1:");
        Label label2 = new Label("Número 2:");
        Label labelResultado = new Label("Resultado:");

        tf1 = new TextField("0.00");
        tf2 = new TextField("0.00");
        tfresultado = new TextField("0.00");
        tfresultado.setEnabled(false);

        panelSuperior.add(label1); panelSuperior.add(tf1);
        panelSuperior.add(label2); panelSuperior.add(tf2);
        panelSuperior.add(labelResultado); panelSuperior.add(tfresultado);

        CheckboxGroup grupo = new CheckboxGroup();
        checkboxSuma = new Checkbox("Sumar", grupo, false);
        checkboxResta = new Checkbox("Restar", grupo, false);
        checkboxMultiplicar = new Checkbox("Multiplicar", grupo, false);
        checkboxDivision = new Checkbox("Dividir", grupo, false);

        panelIntermedio.add(checkboxSuma);
        panelIntermedio.add(checkboxResta);
        panelIntermedio.add(checkboxMultiplicar);
        panelIntermedio.add(checkboxDivision);

        botonCalcular = new Button("Calcular");
        botonLimpiar = new Button("Limpiar");
        panelInferior.add(botonCalcular);
        panelInferior.add(botonLimpiar);

        panelGeneral.add(panelSuperior, BorderLayout.NORTH);
        panelGeneral.add(panelIntermedio, BorderLayout.CENTER);
        panelGeneral.add(panelInferior, BorderLayout.SOUTH);

        add(panelGeneral);
        setVisible(true);
    }
}