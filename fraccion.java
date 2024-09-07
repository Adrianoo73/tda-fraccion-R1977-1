public class fraccion {
    private int numerador;
    private int denominador;

    public fraccion (int numerador, int denominador){
        if (denominador==0){
            System.out.println("EL NUMERADOR NO PUEDE SER 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }
    public fraccion sumar (fraccion nueva) {
        int nuevoNumerador = this.numerador * nueva.numerador + nueva.denominador * this.denominador;
        int nuevoDenominador = this.denominador * nueva.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
    

}
