package Tema9.Bernardo;


public class EjercicioStringBuffer {

    public static void main(String[] args) {
        int numero=5000;
        String s="cucu";
        String aux="";
        StringBuffer sb=new StringBuffer("Hola Caracola");
        StringBuffer name=new StringBuffer("Paco");
        StringBuffer first=new StringBuffer("Martinez");
        StringBuffer second=new StringBuffer("Perez");
        String datos[]={name.substring(0, name.length()),first.substring(0, first.length()),second.substring(0, second.length())};
        
        System.out.println(sb);
        System.out.println("La capacidad de sb es: "+sb.capacity());
        System.out.println("La longitud de sb es: "+sb.length());
        
        sb.append(numero);
        sb.append(s);
        System.out.println(sb);
        
        sb.insert(9,"bonita");
        System.out.println(sb);
        
        sb.delete(0,3);
        System.out.println(sb);
        
        aux=sb.substring(sb.length()-4, sb.length());
        System.out.println(aux);
        
        System.out.println("La capacidad de sb final es: "+sb.capacity());
        System.out.println("La longitud de sb final es: "+sb.length());
        System.out.println(datos[0]+" "+datos[1]+" "+datos[2]);
        
        
    }
    
}
