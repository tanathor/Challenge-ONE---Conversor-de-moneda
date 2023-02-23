import javax.swing.*;
public class ClasePrueba2 {
    public static void main(String[] args) {
        String[] arreglo = {"Continuar","Salir"};
        String opcion = null;
        String cantidad;
        int continuar;
        double montoIngresado = 0;
        int monto=0;
        try {
            do {
                opcion = (JOptionPane.showInputDialog(null, "Selecciona una opcion de Conversion ", "Conversiones",
                        JOptionPane.PLAIN_MESSAGE, null,
                        new Object[] { "Selecciona", "Conversion de moneda", "Conversion de temperatura","Conversion de edad a segundos" },
                        "Selecciona")).toString();

                switch (opcion) {
                    case "Conversion de moneda":

                        do {
                            cantidad = JOptionPane.showInputDialog("Ingrese el monto a cambiar ");
                            montoIngresado = Double.parseDouble(cantidad);

                        } while (montoIngresado == 0);
                        Conversion(montoIngresado);

                        break;

                    case "Conversion de temperatura":

                        cantidad = JOptionPane.showInputDialog("Ingresa los grados a converitr  ");
                        montoIngresado = Double.parseDouble(cantidad);

                        ConversionTem(montoIngresado);break;
                    case "Conversion de edad a segundos":
                        cantidad = JOptionPane.showInputDialog("Ingresa tu  edad!! ");
                        monto=Integer.parseInt(cantidad);
                        ConversionEdad(monto);
                        break;
                    case "Selecciona":
                        JOptionPane.showInternalMessageDialog(null, "Selecciona un opcion invalida ");
                        break;


                }
                continuar=JOptionPane.showInternalOptionDialog(null, "¿Deseas continuar?","CONTINUAR...", 0, 0, null, arreglo,"Continuar");

            } while (continuar==0);

        } catch (Exception e) {

        } finally {
            JOptionPane.showInternalMessageDialog(null, "*****Gracias por usar el programa *****");
        }

    }

    static void Conversion(double montoIngresado){

    }
    static void ConversionTem(double temperatura){

    }
    static void ConversionEdad(int edad){

    }
}

