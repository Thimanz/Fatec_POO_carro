public class Carro{
    
    //variaveis de instancia
    public String modelo;
    public String placa;

    //setters
    public void setModelo(String m){
        modelo = m;
    }
    public void setPlaca(String p){
        placa = p;
    }

    //getters
    //setters
    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){
        return placa;
    }

    //metodos de instancia
    public void acelerarCarro(){
        System.out.println("Acelerando o carro");
    }
    public void capotarCarro(){
        System.out.printf("Capotei o %s\n", modelo);
    }
}