package ImprimirAchivoNumerado;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class printNumerador {
    
    static int numeroTicket=0;

    public static FileWriter fileW_Vuelos;
    public static PrintWriter printer_Ticket;

    static HashMap<String,String[][]> vuelos= new HashMap<String,String[][]>();

    public static void main(String[] args) {

        try {
            String[][] avionMatriz={{"R","R","R"},{"R","R","R"}};
            Scanner input = new Scanner(System.in);
            
            vuelos.put("BOG", avionMatriz);
            vuelos.put("MDE", avionMatriz);

            String opcion="";
            do {

                System.out.println("1. Imprimir ticket");
                System.out.println("2. Vaciar Carpeta Tickets");
                System.out.println("S para salir");

                opcion = input.next().toUpperCase();

                switch (opcion) {
                    case "1":
                        PrintTicket();
                        break;
                    case "2":
                        VaciarCarpeta();
                        break;
                    case "S":
                        System.out.println("Saliendo");
                    break;
                    default:
                        System.out.println("\n\tEscoge una opcion valida");
                        break;
                }

            } while (opcion.charAt(0) != 'S' && opcion.charAt(0) != 's');
        } catch (Exception e) {
            System.out.println("Error: " +e);
        }
    }

    public static void VaciarCarpeta() throws Exception{
        try {
            File folder = new File("E:/Santiago/Programacion/UPB/Proyectos/Final-Logica/Pruebas/ImprimirAchivoNumerado/Tiquetes"); // Reemplaza con la ruta de tu carpeta
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        boolean result = file.delete();
                        if (result) {
                            System.out.println("Archivo eliminado: " + file.getName());
                        } else {
                            System.out.println("No se pudo eliminar el archivo: " + file.getName());
                        }
                    }
                }
            } else {
                System.out.println("No se encontraron archivos en la carpeta.");
            }
        } catch (Exception e) {
            throw new Exception("Error al vaciar carpeta " + e);
        }
    }



    public static String EnumerarTicket() throws Exception{
        try {
            String numeroTicketS="";
            numeroTicket+=1;
            numeroTicketS=""+numeroTicket;
            return numeroTicketS;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Imprimir el ticket: "+e);
            throw new Exception(e);
        }
    }
    
    public static void PrintTicket() throws Exception {
        try {
            String numTicket=EnumerarTicket();
            System.out.println("EL NUMERO ES "+  numTicket);
            fileW_Vuelos = new FileWriter("E:/Santiago/Programacion/UPB/Proyectos/Final-Logica/Pruebas/ImprimirAchivoNumerado/Tiquetes/ticket"+numTicket+".txt");
            printer_Ticket = new PrintWriter(fileW_Vuelos);

            //Contenido del Ticket
            printer_Ticket.println("Ticket #"+numeroTicket +" |----------");
            printer_Ticket.println("Codigo de Vuelo "+vuelos.keySet() +" |----------");

            fileW_Vuelos.close();
            printer_Ticket.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Imprimir el ticket: "+e);
        }
    }
}
