package ec.ups.edu.poo.modelo;

import java.util.Objects;

public class Calculadora implements IOperacion {
    private double valor1;
    private double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double sumar() {
        return valor1 + valor2;
    }

    @Override
    public double restar() {
        return valor1 - valor2;
    }

    @Override
    public double multiplicar() {
        return valor1 * valor2;
    }

    @Override
    public double dividir() {
        return valor1 / valor2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "valor1=" + valor1 + ", valor2=" + valor2 + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calculadora c = (Calculadora) o;
        return Double.compare(valor1, c.valor1) == 0 && Double.compare(valor2, c.valor2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor1, valor2);
    }
}
