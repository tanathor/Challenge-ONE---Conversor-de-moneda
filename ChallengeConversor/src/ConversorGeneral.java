import javax.swing.*;

public class ConversorGeneral {

    public static void main(String[] args) {
        String[] arreglo = {"Continuar","Salir"};
        String opcion = null;
        String cantidad;
        int continuar;
        double montoIngresado = 0;
        int monto=0;
        try {
            do {
                opcion = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversor ", "Conversor de Unidades",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Selecciona", "Conversión de moneda", "Conversión de temperatura","Conversión de Unidades de distancia" }, "Selecciona")).toString();

                switch (opcion) {
                    case "Conversión de moneda":
                        do {
                            cantidad = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
                            montoIngresado = Double.parseDouble(cantidad);

                        } while (montoIngresado == 0);
                        ConversionMoneda(montoIngresado);
                        break;

                    case "Conversión de temperatura":

                        cantidad = JOptionPane.showInputDialog("Ingresa los grados a converitr  ");
                        montoIngresado = Double.parseDouble(cantidad);
                        ConversionTemperatura(montoIngresado);
                        break;

                    case "Conversión de Unidades de distancia":
                        cantidad = JOptionPane.showInputDialog("Ingresa número de unidades a convertir ");
                        monto=Integer.parseInt(cantidad);
                        ConversionUnidades(monto);
                        break;

                    case "Selecciona":
                        JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
                        break;


                }
                continuar=JOptionPane.showInternalOptionDialog(null, "¿Deseas continuar?", "Continuar", 0, 0, null, arreglo,"Continuar");

            } while (continuar==0);

        } catch (Exception e) {

        } finally {
            JOptionPane.showMessageDialog(null, new JLabel("¡Hasta pronto!", JLabel.CENTER), "EXIT", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("Desarrollado por" + " \n Alejandro Muñoz" + " \n ONE G4-2023", JLabel.CENTER), "EXIT", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

    }

    static void ConversionMoneda(double montoIgresado) {
        double tasaCOPaUSD = 4896.18;
        double tasaCOPaEUR = 5199.41;
        double tasaCOPaJPY = 36.32;
        double tasaCOPaGBP = 5904.60;
        double tasaJPYaGBP = 162.48;
        double tasaJPYaEUR = 143.14;
        double tasaJPYaUSD = 134.81;
        double tasaGBPaUSD = 0.83;
        double tasaGBPaEUR = 0.88;
        double tasaEURaUSD = 0.94;
        double mismaTasadeCambio = 1;

        String seleccion;

        seleccion = (JOptionPane.showInputDialog(null, "Seleccione el tipo de conversion que desea hacer.", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "Peso a Dolar", "Peso a Euro", "Peso a Yenes", "Peso a Libras", "Euro a Peso", "Euro a Dolar", "Euro a Libras", "Euro a Yenes", "Dolar a Euro", "Dolar a Peso", "Dolar a Libras", "Dolar a Yenes", "Libras a Peso", "Libras a Dolar", "Libras a Euro", "Libras a Yenes", "Yenes a Peso", "Yenes a Libras", "Yenes a Dolar", "Yenes a Euro"}, "selecciona")).toString();

        switch (seleccion){
            case "Peso a Dolar":
                JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f",montoIgresado / tasaCOPaUSD) + " Dólares"));
                break;

            case "Peso a Euro":
                JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f",montoIgresado / tasaCOPaEUR) + " Euros"));
                break;

            case "Peso a Yenes":
                JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f",montoIgresado / tasaCOPaJPY) + " Yenes"));
                break;

            case "Peso a Libras":
                JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f",montoIgresado / tasaCOPaGBP) + " Libras esterlinas"));
                break;

            case "Euro a Peso":
                JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f",montoIgresado * tasaCOPaEUR) + " Pesos"));
                break;

            case "Euro a Dolar":
                JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f",montoIgresado / tasaEURaUSD) + " Dólares"));
                break;

            case "Euro a Yenes":
                JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f",montoIgresado * tasaJPYaEUR) + " Yenes"));
                break;

            case "Euro a Libras":
                JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f",montoIgresado * tasaGBPaEUR) + "Libras esterlinas"));
                break;

            case "Dolar a Peso":
                JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f",montoIgresado * tasaCOPaUSD) + " Pesos"));
                break;

            case "Dolar a Euro":
                JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f",montoIgresado * tasaEURaUSD) + " Euros"));
                break;

            case "Dolar a Yenes":
                JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f",montoIgresado * tasaJPYaUSD) + " Yenes"));
                break;

            case "Dolar a Libras":
                JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f",montoIgresado * tasaGBPaUSD) + " Libras esterlinas"));
                break;

            case "Libras a Peso":
                JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f",montoIgresado * tasaCOPaGBP) + " Pesos"));
                break;

            case "Libras a Dolar":
                JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f",montoIgresado / tasaGBPaUSD) + " Dólares"));
                break;

            case "Libras a Euro":
                JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f",montoIgresado / tasaGBPaEUR) + " Euros"));
                break;

            case "Libras a Yenes":
                JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f",montoIgresado * tasaJPYaGBP) + " Yenes"));
                break;

            case "Yenes a Peso":
                JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f",montoIgresado * tasaCOPaJPY) + " Pesos"));
                break;

            case "Yenes a Dolar":
                JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f",montoIgresado / tasaJPYaUSD) + " Dólares"));
                break;

            case "Yenes a Euro":
                JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f",montoIgresado / tasaJPYaEUR) + " Euros"));
                break;

            case "Yenes a Libras":
                JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f",montoIgresado / tasaJPYaGBP) + " Libras esterlinas"));
                break;

            default:
                JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
                break;

        }
    }

    static void ConversionTemperatura(double temperatura) {

        String seleccion;

        seleccion = (JOptionPane.showInputDialog(null, " ¿Que conversion de temperatura necesitas? ", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "Selecciona", "Celcius a Fahrenheit", "Celcius a Kelvin", "De Fahrenheit a Celcius",
                        "De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit" },
                "Selecciona")).toString();

        switch (seleccion) {
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
                JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
                break;
        }
    }

    static void ConversionUnidades(int unidades){

    }
}


