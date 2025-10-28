public class Cuadrado
{
    private String color="red";
    private double lado=2.0;
    private char contenido='*';
    
  
    public double Area()
    {
      double area=lado*2;
      return area;
    }
    public double Perimetro()
    {
    double perimetro=lado*4;
      return perimetro;
    }
      
   
    public void setLado(double numeroLado)
    {
      lado=numeroLado;
    }
    
     public char getContenido()
    {
      return contenido;
    }
    
    public void setContenido(char raquel)
    {
      contenido=raquel;
    }
    
}
