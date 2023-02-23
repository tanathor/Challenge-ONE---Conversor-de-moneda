import javax.swing.JOptionPane;
public class ClasePrueba {
    static void Conversion(double montoIngresado) {
        double dolar = 0.054;
        double euro = 0.051;
        double libra = 0.045;
        double yen = 7.30;
        double won = 70.47;
        double peso = 18.00;

        String opcion;

        opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir  ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "Selecciona", "Peso a Dólar", "Peso a Euro", "Peso a Libras", "Peso a Yen",
                        "Peso a Won Coreano", "Dólar a Peso", "Euro a Pesos", "Libras a Pesos" },
                "Selecciona")).toString();

        switch (opcion) {
            case "Peso a Dólar":

                JOptionPane.showInternalMessageDialog(null, "$" + (montoIngresado * dolar) + " Dolares");

                break;

            case "Peso a Euro":

                JOptionPane.showInternalMessageDialog(null, "€ " + (montoIngresado * euro) + " Euros");

                break;
            case "Peso a Libras":

                JOptionPane.showInternalMessageDialog(null, "£ " + montoIngresado * libra + " Euros");

                break;
            case "Peso a Yen":

                JOptionPane.showInternalMessageDialog(null, "¥ " + montoIngresado * yen + " Yenes");

                break;
            case "Peso a Won Coreano":

                JOptionPane.showInternalMessageDialog(null, "₩ " + montoIngresado * won + " Wons");

                break;
            case "Dólar a Peso":

                JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * peso + " Pesos");

                break;
            case "Euro a Pesos":

                JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * 19.63 + " Pesos");

                break;
            case "Libras a Pesos":

                JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * 22.29 + " Pesos");

                break;
            default:

                break;

        }

    }

    static void ConversionTem(double temperatura) {

        String opcion;

        opcion = (JOptionPane.showInputDialog(null, " ¿Que conversion de temperatura necesitas? ", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "Selecciona", "Celcius a Fahrenheit", "Celcius a Kelvin", "De Fahrenheit a Celcius",
                        "De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit" },
                "Selecciona")).toString();

        switch (opcion) {
            case "Celcius a Fahrenheit":

                JOptionPane.showInternalMessageDialog(null, ((temperatura * 1.8) + 32) + " °F");

                break;

            case "Celcius a Kelvin":

                JOptionPane.showInternalMessageDialog(null, (temperatura + 273.15) + " °K");

                break;
            case "De Fahrenheit a Celcius":
                JOptionPane.showInternalMessageDialog(null, ((temperatura - 32) / 1.8) + " °C");
                break;

            case "De Fahrenheit a Kelvin":
                JOptionPane.showInternalMessageDialog(null, (((temperatura - 32) * 0.55) + 273.15) + " °K");
                break;

            case "De Kelvin a Celcius":
                JOptionPane.showInternalMessageDialog(null, (temperatura - 273.15) + " °C");

                break;
            case "De Kelvin a Fahrenheit":
                JOptionPane.showInternalMessageDialog(null, (((temperatura - 273.15) * 0.55) + 32) + " °F");
                break;
            default:
                JOptionPane.showInternalMessageDialog(null, "Selecciona un opcion invalida ");
                break;


        }



    }
    static void ConversionEdad(int edad) {

        JOptionPane.showInternalMessageDialog(null,"Tu edad "+edad+" Años a segundos son "+(edad*3989)+" segundos!!");
    }
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
}
