




class BarcoAMotor extends Barco {
    private int potenciaCV;

    public BarcoAMotor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}