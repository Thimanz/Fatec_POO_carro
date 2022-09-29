public class TesteCarro {
    static public void main(String args []){
        
        //carro1
        Carro car1 = new Carro();
        //valores
        car1.modelo = "Corsa";
        car1.placa = "BRA5A15";
        //imprimindo variaveis de instancia
        System.out.printf("carro 1 - modelo: %s, placa: %s.\n", car1.getModelo(), car1.getPlaca());
        //metodos
        car1.acelerarCarro();
        car1.capotarCarro();

        //carro1
        Carro car2 = new Carro();
        //valores
        car2.modelo = "M3";
        car2.placa = "PBU5H06";
        //imprimindo variaveis de instancia
        System.out.printf("carro 2 - modelo: %s, placa: %s.\n", car2.getModelo(), car2.getPlaca());
        //metodos
        car2.acelerarCarro();
        car2.capotarCarro();
    }
}
