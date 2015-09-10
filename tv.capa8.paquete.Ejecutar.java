package tv.capa8.paquete;
import tv.capa8.paquete.Persona;

public class Ejecutar {
 
    public static void main(String[] argv)
    {
        //creamos un objeto de la clase Persona, es decir creamos una instancia
        //Persona p = new Persona("Juan Pérez","juan@hotmail.com");
        
        Persona p = new Persona();
        System.out.println("El nombre es : "+p.getNombre() );
        System.out.println("El E-Mail es : "+p.getCorreo() );
        p.setNombre("Juan Martínez");
        p.setCorreo("juanito@gmail.com");
        System.out.println("El nombre es : "+p.getNombre() );
        System.out.println("El E-Mail es : "+p.getCorreo() );
        
        p.setNombre2("Pedro Ñandú");
        p.setCorreo2("pedro@gmail.com");
        System.out.println("El nombre es : "+p.getNombre() );
        System.out.println("El E-Mail es : "+p.getCorreo() );
        
        System.out.println("El valor del método estático es "+Persona.retorno());
    }
    
}
