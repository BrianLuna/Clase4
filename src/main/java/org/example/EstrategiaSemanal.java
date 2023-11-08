package org.example;

public class EstrategiaSemanal implements EstrategiaDeSueldo {

    private Integer sueldoDiarioPorSemana;

    public EstrategiaSemanal(Integer sueldoDiarioPorSemana) {
        this.sueldoDiarioPorSemana = sueldoDiarioPorSemana;
    }

    @Override
    public Integer calcularSueldo() {
        return 7 * this.sueldoDiarioPorSemana + 2000;
    }
}
