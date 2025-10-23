
public class ejemplo
{
  plublic void main (String[]args)
  {
    // declarar un array
    int edades[]={1,2,5,7,8};
    int[] edades1={1,2,3,4,5};
    
    //array con cantidad de 3
    //sin valores
    int [] edades2= new int[3];
    // rellenar
    edades[0]=2;
    edades[1]=3;
    
    //imprimir un array
    for(int i=0; i<edades.lenght;i++)
      {
        System.out.println(edades[i]);
      }
//inicializacion de array 1
    int[] edades1={1,2,3,4,5};
    System.out.printl(longitud[6]);

//inicializar con arry de das
    //[3] es lo de arriba de la tablas(fila)
    //[2] es lo de abajo de la tabla (columna)
     int[][] longitudes= new int[3][2];
    longitudes[0][0]=1;
    longitudes[0][1]=2;
    longitudes[1][0]=3;
    longitudes[1][1]=4;
    longitudes[2][0]=5;
    longitudes[2][1]=6;

    //recorrer el array de ariba y abajo
    for(int fuera=0;fuera<longitudes.length;fuera++)
      {
        for(int dentro=0; dentro<longitudes[fuera.length];dentro++)
          {
            System.out.println(longitudes[fuera][dentro]);
          }
    
    
    
  }
    
  
