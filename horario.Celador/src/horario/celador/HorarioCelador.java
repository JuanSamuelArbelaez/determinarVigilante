package horario.celador;

import javax. swing.JOptionPane;

public class HorarioCelador
{
    public static void imprimir(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int leerInt(String mensaje)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static String determinarCelador(int dia)
    {
        String celador;
        
        switch (dia)
        {
            case 1:
            case 2:
            case 3: celador = "Le toca a Juan";
                    break;
            
            case 4:
            case 5: celador = "Le toca a Pepe";
                    break;
            
            case 6:
            case 7: celador = "Le toca a Chucho";
                    break;
            
            default:celador = "El dia ingresado es invalido";
                    break;
        }
        return celador;
    }
    
    public static void main(String[] args)
    {
        String celador;
        int dia;
        
        dia=leerInt("Ingrese el dia de la semana (1-7): ");
        celador=determinarCelador(dia);
        
        imprimir(celador);
    }
}