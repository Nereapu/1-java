public class TestCudrado
{
    public static void main(String[]args)
    {
      
      Cuadrado[] paco=new Cuadrado[5];
      Cuadrado pepe;
      Cuadrado cuadrado1=new Cuadrado();

      Cuadrado cuadrado2=new Cuadrado();
      
      Cuadrado Circulo1=new Cuadrado();
      cuadrado1.setLado(9);
      cuadrado2.setContenido('-');
      char conte= cuadrado2.getContenido();
      double perime=cuadrado1.Perimetro();
      System.out.println(perime);  
      boolean par = true;
      
      for(int e=0;e<4;e++) 
      {
        //creando un objeto cuadrado 
        paco[e]=new Cuadrado();
        //para que salga *, - ,*, - 
        par=!par;
        if(par== true)
        {
          paco[e].setContenido('-');
        }
      }


      for(int i =0; i<paco[i].getContenido();++i)
      {
        System.out.println(paco[i].getContenido());
      }
     
     
      
    }
}
