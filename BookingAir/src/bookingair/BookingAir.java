package bookingair;

import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class BookingAir {
    
    //Abrir el Formulario
    static f_Reservas form_Reservas = new f_Reservas();
    
    //Objetos Formulario
    //static JButton b_enviarDatos1,b_enviarDatos2, b_imprimirT,b_VaciarDatos;
    
    
    //Archivos
        //Lectura
    public static FileReader file_vuelos;
    public static BufferedReader dato_vuelos;
        //Escritura
    public static FileWriter fileW_Vuelos;
    public static PrintWriter printer_Ticket;
    
    //Datos
        //Del Formulario
    static String[] datosVuelo; 
        //Obtener Clase Vuelo
    static String ClaseMain;

        //Otros
    static String valorVuelo="";
    static int numeroTicket=0;
    static String numeroSilla="";
    static String MatrizAsientosAvion="";
    static String saveFVuelta="";
    static String saveTrayecto="";
    static byte idaOvuelta=0;
    
    
    //Disponibilidad - Contador Gente Total
    static int countGen  = 0;
    
    
    //HashMap Vuelos
    //static HashMap<String, String[][]>vuelos = new HashMap<>();
    //Listas Vuelos
    static ArrayList<String[][]> vuelos = new ArrayList<String[][]>();
    static ArrayList<String> trayectos = new ArrayList<String>();
    
    
    //HashMap Tarifas
    static HashMap<String, String>economica = new HashMap<String, String>();
    static HashMap<String, String>ejecutiva = new HashMap<String, String>();
    static HashMap<String, Integer>ventasTiquetes = new HashMap<String, Integer>();

    public static void main(String[] args) {

        try {
            //Mostrar Formulario
            form_Reservas.setVisible(true);
            
            //Definir Objetos Formulario
            /*b_enviarDatos1 = form_Reservas.b_enviarDatos1;
            b_enviarDatos2 = form_Reservas.b_enviarDatos2;
            b_imprimirT = form_Reservas.b_imprimirT;
            b_VaciarDatos = form_Reservas.b_VaciarDatos;*/
            
            //Definir arcivos
                //Lectura
            //file_vuelos = new FileReader("E:\\Santiago\\Programacion\\UPB\\Proyectos\\Final-Logica\\BookingAir\\src\\bookingair\\files\\vuelos.txt");
            //dato_vuelos= new BufferedReader(file_vuelos);
                //Escritura
                
                
            //Definir lista
            trayectos.add("Medellín-Bogotá");
            trayectos.add("Bogotá-Medellín");
            trayectos.add("MedellínToB");
            trayectos.add("Bogotá");
            trayectos.add("MedellínToS");
            trayectos.add("San Andrés");
            trayectos.add("Medellín-San Andrés");
            trayectos.add("San Andrés-Medellín");
  
            //Definir Hash Maps
            economica.clear();
            ejecutiva.clear();
            ventasTiquetes.clear();
            
            economica.put(trayectos.get(0), "$225.000");
            economica.put(trayectos.get(1), "$225.000");
            economica.put(trayectos.get(2), "$150.000");
            economica.put(trayectos.get(3), "$150.000");
            economica.put(trayectos.get(4), "$220.000");
            economica.put(trayectos.get(5), "$220.000");
            economica.put(trayectos.get(6), "$380.000");
            economica.put(trayectos.get(7), "$380.000");
            
            ejecutiva.put(trayectos.get(0), "$400.000");
            ejecutiva.put(trayectos.get(1), "$400.000");
            ejecutiva.put(trayectos.get(2), "$290.000");
            ejecutiva.put(trayectos.get(3), "$290.000");
            ejecutiva.put(trayectos.get(4), "$450.000");
            ejecutiva.put(trayectos.get(5), "$ 450.000");
            ejecutiva.put(trayectos.get(6), "$800.000");
            ejecutiva.put(trayectos.get(7), "$800.000");
            
            ventasTiquetes.put(trayectos.get(0), 0);
            ventasTiquetes.put(trayectos.get(1), 0);
            ventasTiquetes.put(trayectos.get(2), 0);
            ventasTiquetes.put(trayectos.get(3), 0);
            ventasTiquetes.put(trayectos.get(4), 0);
            ventasTiquetes.put(trayectos.get(5), 0);
            ventasTiquetes.put(trayectos.get(6), 0);
            ventasTiquetes.put(trayectos.get(7), 0);
            
                
        //Listeners de botones del formulario
                //Boton Reservar en Solo ida
            form_Reservas.b_enviarDatos1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        datosVuelo = form_Reservas.GetDatosForm();
                        ClaseMain = form_Reservas.GetClase();
                        printVectorDatos(datosVuelo);
                        CalcularPrecio();
                        ObtenerDatosGrafica();
                        Llenar_avion(vuelos);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error Listener:" + e + ",\nException: " + ex);
                    }
                }
            });
                //Boton Reservar en Ida y Vuelta
                
            form_Reservas.b_enviarDatos2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        datosVuelo = form_Reservas.GetDatosForm();
                        ClaseMain = form_Reservas.GetClase();
                        System.out.println("\t\t Crudo");
                        printVectorDatos(datosVuelo);
                        CalcularPrecio();
                        ObtenerDatosGrafica();
                        
                        saveTrayecto=datosVuelo[2];
                        saveFVuelta=datosVuelo[1];
                        idaOvuelta=1;
                        datosVuelo[1]="";
                        ReordenarTrayecto(idaOvuelta);
                        System.out.println("\t\t Vuelo Ida");
                        printVectorDatos(datosVuelo);
                        Llenar_avion(vuelos);
                        
                        datosVuelo[0]=saveFVuelta;
                        datosVuelo[2]=saveTrayecto;
                        idaOvuelta=2;
                        ReordenarTrayecto(idaOvuelta);
                        System.out.println("\t\t Vuelo Regreso");
                        printVectorDatos(datosVuelo);
                        Llenar_avion(vuelos);
                        
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error Listener:" + e + ",\nException: " + ex);
                    }
                }
            });
                //Boton Imprimir Tiquete en pestaña Vuelos
            form_Reservas.b_imprimirT.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        PrintTicket();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error:" + e);
                    }
                }
            });
                //Boton Borrar datos pasados
            form_Reservas.b_VaciarDatos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Restart();
                        numeroTicket=0;
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Error:" + e);
                    }
                }
            });
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "  + e);
        }
    }
    
    //Funciones

    public static void printVectorDatos(String[] vector) {
        for (int i = 0; i < datosVuelo.length; i++) {
            System.out.print("Dato"+ i+": "+datosVuelo[i]+"\t");
        }
        System.out.print("\n");
        
        
        /*
        for (String[][] matriz : vuelos) {
            for (String[] fila : matriz) {
                for (String elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
            System.out.println();
        }*/
    }
    
    public static void inciar_avion(String[][] m_asientosAvion) throws Exception{
        try {
            for (int fila = 1; fila < m_asientosAvion.length; fila++) {
                
                for (int colum= 0; colum < m_asientosAvion[0].length; colum++) {
                    m_asientosAvion[fila][colum]="L";
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al vaciar el avion: " + e);
            throw new Exception("Ocurrio un error al vaciar el avion: " + e);
        }
    }
    
    public static void ReordenarTrayecto(byte idaOvuelta) throws Exception {
        try {
            /*
            trayectos.add("Medellín-Bogotá");
            trayectos.add("Bogotá-Medellín");
            trayectos.add("MedellínToB");
            trayectos.add("Bogotá");
            trayectos.add("MedellínToS");
            trayectos.add("San Andrés");
            trayectos.add("Medellín-San Andrés");
            trayectos.add("San Andrés-Medellín");
            */
            
            switch (idaOvuelta) {
                case 1:
                    if (datosVuelo[2].equals(trayectos.get(0))) {
                    datosVuelo[2]="MedellínToB";
                    } else if (datosVuelo[2].equals(trayectos.get(1))) {
                        datosVuelo[2]="Bogotá";
                    } else if (datosVuelo[2].equals(trayectos.get(6))) {
                        datosVuelo[2]="MedellínToS";
                    } else if (datosVuelo[2].equals(trayectos.get(7))) {
                        datosVuelo[2]="San Andrés";
                    } else{
                        datosVuelo[2]=datosVuelo[2];
                    }    
                    break;
                case 2:
                    if (datosVuelo[2].equals(trayectos.get(0))) {
                    datosVuelo[2]="Bogotá";
                    } else if (datosVuelo[2].equals(trayectos.get(1))) {
                        datosVuelo[2]="MedellínToB";
                    } else if (datosVuelo[2].equals(trayectos.get(6))) {
                        datosVuelo[2]="San Andrés";
                    } else if (datosVuelo[2].equals(trayectos.get(7))) {
                        datosVuelo[2]="MedellínToS";
                    } else{
                        datosVuelo[2]=datosVuelo[2];
                    }  
                    break;
                default:
                    throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ReordenarTrayecto: "+e);
            throw new Exception("Error al ReordenarTrayecto: "+e);
        }
    }
    
    
    
    public static void CalcularPrecio() throws Exception {
        try {
            if (ClaseMain.equalsIgnoreCase("Económica")) {
                for (String key : economica.keySet()) {
                    if (datosVuelo[2].equalsIgnoreCase(key)) {
                        valorVuelo=economica.get(key);
                    } 
                }
                System.out.println(valorVuelo);
                form_Reservas.l_PrecioVuelo1.setText(valorVuelo);
  
            } else if (ClaseMain.equalsIgnoreCase("Ejecutiva")) {
                for (String key : ejecutiva.keySet()) {
                    if (datosVuelo[2].equalsIgnoreCase(key)) {
                        valorVuelo=ejecutiva.get(key);
                    } 
                }
                System.out.println(valorVuelo);
                form_Reservas.l_PrecioVuelo1.setText(valorVuelo);
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Calcular el valor del vuelo: "+e);
            throw new Exception("Ha ocurrido un error al Calcular el valor del vuelo: "+e);
        }
    }
    
    public static void ObtenerDatosGrafica() throws Exception {
        try {
            int valorActual=0;
            for (String key : ventasTiquetes.keySet()) {
                if (datosVuelo[2].equalsIgnoreCase(key)) {
                    valorActual = ventasTiquetes.get(key);
                    ventasTiquetes.put(key, valorActual+1);
                    f_Reservas.datosForm.setValue(ventasTiquetes.get(key), "Vuelos", key);
                } 
            }
            System.out.println(ventasTiquetes.values());
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ObtenerDatosGrafica: "+e);
            throw new Exception("Error al ObtenerDatosGrafica: "+e);
        }
    }
    
    
    public static void Llenar_avion(ArrayList<String[][]> vuelos) throws Exception{
        
        try {
            boolean validacion = false;

            if (vuelos.isEmpty()) {
                String[][] codigoVuelos = new String[14][4];
                codigoVuelos[0] = datosVuelo;
                vuelos.add(codigoVuelos);
                inciar_avion(vuelos.get(vuelos.size() - 1));
                asignarSillas(vuelos.get(vuelos.size() - 1));
                System.out.println("Vuelo Nuevo-Sillas reservadas: "+contador_disponibilidad(vuelos.get(vuelos.size() - 1)) + "\n");
                //System.out.println(vuelos.get(vuelos.size() - 1)[0][0]);
            } else {
                for (String elem[][] : vuelos) {

                    if (elem[0][0].equals(datosVuelo[0]) && elem[0][1].equals(datosVuelo[1]) && elem[0][2].equals(datosVuelo[2]) && elem[0][3].equals(datosVuelo[3])) {
                        //System.out.println("si");
                        //System.out.println(elem);
                        asignarSillas(elem);
                        System.out.println("\t Vuelo Activo-Sillas reservadas: "+contador_disponibilidad(elem) + "\n");

                        validacion = true;
                        System.out.println(validacion);
                        break;
                    }
                }

                if (!validacion) {
                    String[][] codigoVuelos = new String[14][4];
                    codigoVuelos[0] = datosVuelo;
                    //System.out.println("no");
                    vuelos.add(codigoVuelos);
                    //System.out.println(vuelos.get(vuelos.size() - 1)[0]);
                    inciar_avion(vuelos.get(vuelos.size() - 1));
                    asignarSillas(vuelos.get(vuelos.size() - 1));
                    System.out.println("\t Vuelo Nuevo-Sillas reservadas: "+contador_disponibilidad(vuelos.get(vuelos.size() - 1)) + "\n");

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Llenar avion: "+e);
            throw new Exception("Error al Llenar avion: "+e);
        }

    }
    
    public static void asignarSillas(String elem[][]) throws Exception{
        try {
            int countEje = 0;
            int countEco = 0;
            boolean validacion = false;
            numeroSilla="";

            if (ClaseMain.equalsIgnoreCase("Ejecutiva")) {


                //Llena
                for (int fil = 1; fil < 17; fil++) {
                    for (int col = 0; col < datosVuelo.length; col++) {

                        if (elem[fil][col].equals("L") && countEje <12) {
                            elem[fil][col] = "R";
                            countGen++;

                            String colLetra="";
                            switch (col) {
                            case 0: colLetra="A";
                                break;
                            case 1: colLetra="B";
                                break;
                            case 2: colLetra="C";
                                break;
                            case 3: colLetra="D";
                                break;
                            default:;
                            }
                            numeroSilla=""+(fil)+colLetra;
                            System.out.println(numeroSilla); 
                            form_Reservas.l_datoSillaV.setText(numeroSilla);

                            validacion = true;
                            break;
                        }
                        else {
                            countEje++;

                        }
                    }
                    if(validacion || countEje  == 12){
                        break;
                    }
                }

                //Imprime
                MatrizAsientosAvion="";
                for (int fila = 1; fila < elem.length; fila++) {
                    //System.out.print(fila);
                    MatrizAsientosAvion+=fila;
                    for (int colum = 0; colum < elem[0].length; colum++) {
                        //System.out.print("\t" + elem[fila][colum]);
                        MatrizAsientosAvion+="    \t"+elem[fila][colum];
                    }

                    //System.out.println("");
                    MatrizAsientosAvion+="\n";
                }
                JOptionPane.showMessageDialog(null,"Esta es la ocupacion actual del avion: \n"+MatrizAsientosAvion);

                if (countEje == 12){
                    System.out.println("Ejecutivo Lleno");
                    JOptionPane.showMessageDialog(null, "Ejecutivo Lleno para este vuelo\n"+MatrizAsientosAvion);
                    form_Reservas.l_DisponibleV.setText("No Disponible");
                }
            } else {

                //Llena
                for (int fil = 4; fil < elem.length; fil++) {

                    for (int col = 0; col < datosVuelo.length; col++) {

                        if (elem[fil][col].equals("L") && countEco <40) {
                            elem[fil][col] = "R";
                            countGen++;

                            String colLetra="";
                            switch (col) {
                            case 0: colLetra="A";
                                break;
                            case 1: colLetra="B";
                                break;
                            case 2: colLetra="C";
                                break;
                            case 3: colLetra="D";
                                break;
                            default:;
                            }
                            numeroSilla=""+(fil)+colLetra;
                            System.out.println(numeroSilla); 
                            form_Reservas.l_datoSillaV.setText(numeroSilla);

                            validacion = true;
                            break;
                        }
                        else {
                            countEco++;
                        }
                    }
                    if(validacion || countEco  == 40){
                        break;
                    }
                }

                //Imprime
                MatrizAsientosAvion="";
                for (int fila = 1; fila < elem.length; fila++) {
                   // System.out.print(fila);
                    MatrizAsientosAvion+=fila;
                    for (int colum = 0; colum < elem[0].length; colum++) {
                        //System.out.print("\t" + elem[fila][colum]);
                        MatrizAsientosAvion+="    "+elem[fila][colum];
                    }

                    //System.out.println("");
                    MatrizAsientosAvion+="\n";
                }
                JOptionPane.showMessageDialog(null,"Esta es la ocupacion actual del avion: \n"+ MatrizAsientosAvion);

                if (countEco == 40){
                    System.out.println("Economico Lleno");
                    JOptionPane.showMessageDialog(null, "Economico Lleno para este vuelo\n"+MatrizAsientosAvion);
                    f_Reservas.TabsOpciones.setSelectedIndex(0);
                }
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al asignar sillas: "+e);
            throw new Exception("Error al asignar sillas: "+e);
        }
    }
        
    public static int contador_disponibilidad(String elem[][]) throws Exception{
        try {
            int countGen = 0;

            for (int fila = 1; fila < elem.length; fila++) {
                    for (int colum = 0; colum < elem[0].length; colum++) {

                        if (elem[fila][colum] == "R"){
                            countGen++;
                        }
                    }
            }
            return countGen;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en funcion contador_disponibilidad: "+e);
            throw new Exception("Error en funcion contador_disponibilidad: "+e);
        }
    }

    //Funciones para Imprimir el tiquete
    public static void Restart() throws Exception{
        try {
                // Reemplaza con la ruta de tu carpeta
            File folder = new File("E:/Santiago/Programacion/UPB/Proyectos/Final-Logica/BookingAir/src/bookingair/files/Tickets"); 
            File[] listOfFiles = folder.listFiles();

            
            vuelos = new ArrayList<String[][]>();
            f_Reservas.datosForm.clear();
            
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
            JOptionPane.showMessageDialog(null, "Error al VaciarCarpeta: "+e);
            throw new Exception("Error al VaciarCarpeta: "+e);
        }
    }



    public static String EnumerarTicket() throws Exception{
        try {
            String numeroTicketS="";
            numeroTicket+=1;
            numeroTicketS=""+numeroTicket;
            return numeroTicketS;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al EnumerarTicket: "+e);
            throw new Exception("Error al EnumerarTicket: "+e);
        }
    }
    
    public static void PrintTicket() throws Exception {
        try {
            String numTicket=EnumerarTicket();
                // Reemplaza con la ruta de tu carpeta
            fileW_Vuelos = new FileWriter("E:/Santiago/Programacion/UPB/Proyectos/Final-Logica/BookingAir/src/bookingair/files/Tickets/ticket"+numTicket+".txt");
            printer_Ticket = new PrintWriter(fileW_Vuelos);

            //Contenido del Ticket
            printer_Ticket.println("Ticket #"+numeroTicket);
            printer_Ticket.println("Código de vuelo: "+vuelos.get(vuelos.size() - 1)[0][0]+"/"+vuelos.get(vuelos.size() - 1)[0][1]+"/"+vuelos.get(vuelos.size() - 1)[0][2]+"/"+vuelos.get(vuelos.size() - 1)[0][3]);
            printer_Ticket.println("Silla: "+numeroSilla);
            

            printer_Ticket.println("Clase: "+ClaseMain);
            printer_Ticket.println("Valor: "+valorVuelo); 

            fileW_Vuelos.close();
            printer_Ticket.close();
            System.out.println("Se ha impreso correctamente ticket"+numTicket+".txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al Imprimir el ticket: "+e);
            throw new Exception("Ha ocurrido un error al Imprimir el ticket: "+e);
        }
    }
    
}
