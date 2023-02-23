import javax.swing.*;

public class ConversorGeneral {
    public static void main(String[] args) {
        String[] arreglo = {"Continuar","Salir"};
        String opciones = null;
        String cantidad;
        int continuar;
        double montoIngresado = 0;
        int monto=0;
        try {
            do {
                opciones = (JOptionPane.showInputDialog(null, "Selecciona una opcion de Conversor ", "Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Selecciona", "Conversor de Moneda", "Conversor de Temperatura","Conversor de Unidades de distancia" }, "Selecciona una opción")).toString();

                switch (opciones) {
                    case "Conversion de moneda":

                        do {
                            cantidad = JOptionPane.showInputDialog("Ingrese la cantidad a cambiar ");
                            montoIngresado = Double.parseDouble(cantidad);

                        } while (montoIngresado == 0);
                        ConversionMoneda(montoIngresado);

                        break;

                    case "Conversion de temperatura":

                        cantidad = JOptionPane.showInputDialog("Ingresa los grados a converitr  ");
                        montoIngresado = Double.parseDouble(cantidad);

                        ConversionTemperatura(montoIngresado);break;
                    case "Conversion de edad a segundos":
                        cantidad = JOptionPane.showInputDialog("Ingresa tu  edad!! ");
                        monto=Integer.parseInt(cantidad);
                        ConversionUnidades(monto);
                        break;
                    case "Selecciona":
                        JOptionPane.showInternalMessageDialog(null, "Selecciona un opcion invalida ");
                        break;


                }
                continuar=JOptionPane.showInternalOptionDialog(null, "¿Deseas continuar?","CONTINUAR...", 0, 0, null, arreglo,"Continuar");

            } while (continuar==0);

        } catch (Exception e) {

        } finally {
            JOptionPane.showMessageDialog(null, new JLabel("¡Hasta pronto!", JLabel.CENTER) , "EXIT", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("Desarrollado por" + " \n Alejandro Muñoz" + " \n ONE G4-2023", JLabel.CENTER) , "EXIT", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

    }



    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

    static void ConversionMoneda(double montoIgresado){

    }

    static void ConversionUnidades(int edad){

    }

    static void ConversionTemperatura(double temperatura){

    }
}


