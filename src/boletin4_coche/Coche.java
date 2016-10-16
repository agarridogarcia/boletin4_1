
package boletin4_coche;


public class Coche {
    //atributo
    private int velocidade, velocidadeCoche ;
    //constructores
    public Coche(){
    velocidade =0 ;
    velocidadeCoche=0;
    }
    public Coche (int V, int vCoche){
        velocidade=V;
        velocidadeCoche=vCoche;
    }
    //métodos de acceso
    
    public int getvelocidade (){
        return velocidade;
    }
    public void setvelocidade(int V){
        velocidade=V;
    }
    public void acelerar (int valor){
        velocidade=velocidade+valor;
        
    }
    public void frenar (int menos){
        velocidade=velocidade-menos;
    }
    public int getvelocidadeCoche(){
    return velocidadeCoche;
    }
    
    
    public void setvelocidadeCoche(int vCoche){
        
        velocidadeCoche=vCoche;
    }
    
    
    public void calcular_velocidadeCoche(int menos, int valor){
    velocidadeCoche=velocidade+valor-menos;
    
    }
    public void visualizar(){
        System.out.println("A velocidade actual do coche e = " + velocidadeCoche );
        
        }
}
