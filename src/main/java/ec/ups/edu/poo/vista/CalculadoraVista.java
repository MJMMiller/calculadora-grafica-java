package ec.ups.edu.poo.vista;

import ec.ups.edu.poo.modelo.Calculadora;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

public class CalculadoraVista extends Frame {

    private Calculadora calculadora;
    private Panel panelGneral;
    private Panel panelSuperior;
    private Panel panelIntermedio;
    private Panel panelInferior;

    //Etiquetas
    private Label labelNum1;
    private Label labelNum2;
    private Label labelResultado;

    //Caja de texto
    private TextField textFieldNum1;
    private TextField textFieldNum2;
    private TextField textFieldResultado;

    //Checkbox
    private Checkbox checkboxSuma;
    private Checkbox checkboxResta;
    private Checkbox checkboxMultiplicar;
    private Checkbox checkboxDividir;

    //Botones
    private Button buttonCalcular;
    private Button buttonLimpiar;


    public CalculadoraVista(){

        setTitle("Calculadora");
        setSize(500,500);
        setLocationRelativeTo(null);

        panelGneral = new Panel(new GridLayout(3, 1));
        panelSuperior = new Panel(new GridLayout(3,2));
        panelIntermedio =  new Panel(new GridLayout(2,2));
        panelInferior = new Panel(new GridLayout());

        //Etiquetas
        labelNum1 = new Label("Numero 1");
        labelNum2 = new Label("Numero 2");
        labelResultado = new Label("Resultado");

        //Caja de texto
        textFieldNum1 = new TextField("0.00",10);
        textFieldNum2 = new TextField("0.00",10);
        textFieldResultado = new TextField("0.00",10);

        //Agrgar al panel Superior
        panelSuperior.add(labelNum1);
        panelSuperior.add(textFieldNum1);

        panelSuperior.add(labelNum2);
        panelSuperior.add(textFieldNum2);

        panelSuperior.add(labelResultado);
        panelSuperior.add(textFieldResultado);

        //Checkbox
        checkboxSuma = new Checkbox("Sumar",false);
        checkboxResta = new Checkbox("Restar",false);
        checkboxMultiplicar = new Checkbox("Multiplicar",false);
        checkboxDividir = new Checkbox("Dividir",false);

        //Agregar al panel Intermedio

        panelIntermedio.add(checkboxSuma);
        panelIntermedio.add(checkboxResta);
        panelIntermedio.add(checkboxMultiplicar);
        panelIntermedio.add(checkboxDividir);

        //Botones
        buttonCalcular = new Button("Calcular");
        buttonLimpiar = new Button("Limpiar");

        //Agregar al Panek Inferior

        panelInferior.add(buttonCalcular);
        panelInferior.add(buttonLimpiar);


        //Agregar Subpaneles al General
        panelGneral.add(panelSuperior);
        panelGneral.add(panelIntermedio);
        panelGneral.add(panelInferior);

        add(panelGneral);
        setVisible(true);

        //Agregar los listeners

        checkboxSuma.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validarCheckbox((Checkbox) e.getSource());
            }
        });

    }
    public void validarCheckbox(Checkbox checkbox){

        if (checkbox.getState() == true) {
            switch (checkbox.getLabel()) {
                case "Sumar":
                    checkboxSuma.setState(true);
                    checkboxResta.setState(false);
                    checkboxMultiplicar.setState(false);
                    checkboxDividir.setState(false);
                    break;

                case "Restar":
                    checkboxSuma.setState(false);
                    checkboxResta.setState(true);
                    checkboxMultiplicar.setState(false);
                    checkboxDividir.setState(false);
                    break;

                case "Multiplicar":
                    checkboxSuma.setState(false);
                    checkboxResta.setState(false);
                    checkboxMultiplicar.setState(true);
                    checkboxDividir.setState(false);
                    break;

                case "Dividir":
                    checkboxSuma.setState(false);
                    checkboxResta.setState(false);
                    checkboxMultiplicar.setState(false);
                    checkboxDividir.setState(true);
                    break;
            }
        }
    }

    public Panel getPanelGneral() {
        return panelGneral;
    }

    public void setPanelGneral(Panel panelGneral) {
        this.panelGneral = panelGneral;
    }

    public Panel getPanelSuperior() {
        return panelSuperior;
    }

    public void setPanelSuperior(Panel panelSuperior) {
        this.panelSuperior = panelSuperior;
    }

    public Panel getPanelIntermedio() {
        return panelIntermedio;
    }

    public void setPanelIntermedio(Panel panelIntermedio) {
        this.panelIntermedio = panelIntermedio;
    }

    public Panel getPanelInferior() {
        return panelInferior;
    }

    public void setPanelInferior(Panel panelInferior) {
        this.panelInferior = panelInferior;
    }

    public Label getLabelNum1() {
        return labelNum1;
    }

    public void setLabelNum1(Label labelNum1) {
        this.labelNum1 = labelNum1;
    }

    public Label getLabelNum2() {
        return labelNum2;
    }

    public void setLabelNum2(Label labelNum2) {
        this.labelNum2 = labelNum2;
    }

    public Label getLabelResultado() {
        return labelResultado;
    }

    public void setLabelResultado(Label labelResultado) {
        this.labelResultado = labelResultado;
    }

    public TextField getTextFieldNum1() {
        return textFieldNum1;
    }

    public void setTextFieldNum1(TextField textFieldNum1) {
        this.textFieldNum1 = textFieldNum1;
    }

    public TextField getTextFieldNum2() {
        return textFieldNum2;
    }

    public void setTextFieldNum2(TextField textFieldNum2) {
        this.textFieldNum2 = textFieldNum2;
    }

    public TextField getTextFieldResultado() {
        return textFieldResultado;
    }

    public void setTextFieldResultado(TextField textFieldResultado) {
        this.textFieldResultado = textFieldResultado;
    }

    public Checkbox getCheckboxSuma() {
        return checkboxSuma;
    }

    public void setCheckboxSuma(Checkbox checkboxSuma) {
        this.checkboxSuma = checkboxSuma;
    }

    public Checkbox getCheckboxResta() {
        return checkboxResta;
    }

    public void setCheckboxResta(Checkbox checkboxResta) {
        this.checkboxResta = checkboxResta;
    }

    public Checkbox getCheckboxMultiplicar() {
        return checkboxMultiplicar;
    }

    public void setCheckboxMultiplicar(Checkbox checkboxMultiplicar) {
        this.checkboxMultiplicar = checkboxMultiplicar;
    }

    public Checkbox getCheckboxDividir() {
        return checkboxDividir;
    }

    public void setCheckboxDividir(Checkbox checkboxDividir) {
        this.checkboxDividir = checkboxDividir;
    }

    public Button getButtonCalcular() {
        return buttonCalcular;
    }

    public void setButtonCalcular(Button buttonCalcular) {
        this.buttonCalcular = buttonCalcular;
    }

    public Button getButtonLimpiar() {
        return buttonLimpiar;
    }

    public void setButtonLimpiar(Button buttonLimpiar) {
        this.buttonLimpiar = buttonLimpiar;
    }
}
