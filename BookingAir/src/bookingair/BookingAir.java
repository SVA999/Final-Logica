package bookingair;

import javax.swing.JOptionPane;

public class BookingAir {

    public static void main(String[] args) {

        try {
            //Abrir el Formulario
            f_Reservas form = new f_Reservas();
            form.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "  + e);
        }
    }
}
