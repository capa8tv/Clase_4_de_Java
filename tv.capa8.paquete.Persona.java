package tv.capa8.paquete;

//declaración de una clase
public class Persona
{
    //atributos o propiedades
    //principio de encapsulamiento
   private String nombre ;
   private String correo;
   private int edad;
    
    //constructor
   //sobrecarga de constructores
   //ser utilizado para inicializar valores
   //porque el constructor se ejecuta cuando se crea la instancia de la clase
  public Persona() 
  {
      this.nombre="César Cancino";
      this.correo="yo@cesarcancino.com";
  }
  public Persona(String n)
  {
      this.nombre=n;
  }
  public Persona(String n,String c)
  {
      this.nombre=n;
      this.correo=c;
  }
    
//métodos de retorno    

  public String getNombre()//getter
  {
      return this.nombre;
  }
  public String getCorreo()
  {
      return this.correo;
  }
  
//métodos de ejecución
  public void setCorreo(String c)//setter
  {
      this.correo=c;
  } 
  public void setNombre(String n)
  {
      this.nombre=n;
  }
   public void setCorreo2(String c)
  {
      this.correo=c;
  } 
  public void setNombre2(String n)
  {
      this.nombre=n;
  }
    
    
//métodos estáticos
//métodos que no necesitan una instancia de la clase para ser utilizados
//no pueden acceder a ningún recurso de la clase
 public static String retorno()
 {
     return "Hola desde mi método estático";
 }   
    
}
