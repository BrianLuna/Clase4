package org.example;

public class EstrategiaQuincenal implements EstrategiaDeSueldo{

    private Integer sueldoDiarioPorQuincena;

    public EstrategiaQuincenal(Integer sueldoDiarioPorQuincena) {
        this.sueldoDiarioPorQuincena = sueldoDiarioPorQuincena;
    }

    @Override
    public Integer calcularSueldo() {
        return 14 * this.sueldoDiarioPorQuincena;
    }
}
