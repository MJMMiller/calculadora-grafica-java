package ec.ups.edu.poo.modelo;

import java.util.Objects;

public class Calculadora implements IOperacion{

    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calculadora operacion = (Calculadora) o;
        return Double.compare(num1, operacion.num1) == 0 && Double.compare(num2, operacion.num2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    @Override
    public double sumar(){
        return num1 + num2;
    }

    @Override
    public double restar(){
        return num1 + num2;
    }

    @Override
    public double multiplicar(){
        return num1 + num2;
    }

    @Override
    public double dividir(){
        return num1 + num2;
    }

}