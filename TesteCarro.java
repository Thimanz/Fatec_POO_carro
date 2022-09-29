import javax.swing.JOptionPane;
public class TesteCarro {
    static public void main(String args []){
        //carro1
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro 1");
        String placa = JOptionPane.showInputDialog("Digite a placa do carro 1");
        Carro car1 = new Carro(modelo, placa);
        //imprimindo variaveis de instancia
        JOptionPane.showMessageDialog(null, String.format("Carro 1 - Modelo: %s, Placa: %s.\n", car1.getModelo(), car1.getPlaca()));
        //metodos
        car1.acelerarCarro();
        car1.capotarCarro();

        //carro2
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro 2");
        placa = JOptionPane.showInputDialog("Digite a placa do carro 2");
        Carro car2 = new Carro(modelo, placa);
        //imprimindo variaveis de instancia
        JOptionPane.showMessageDialog(null, String.format("Carro 2 - Modelo: %s, Placa: %s.\n", car2.getModelo(), car2.getPlaca()));
        //metodos
        car2.acelerarCarro();
        car2.capotarCarro();
    }
}
