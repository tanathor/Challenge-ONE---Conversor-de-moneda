import javax.swing.*;

public class ConversorGeneral {

    public static void main(String[] args) {
        String[] arreglo = {"Continuar","Salir"};
        String opcion = null;
        String cantidad;
        int continuar;
        double montoIngresado = 0;
        double monto=0;
        try {
            do {
                opcion = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversor ", "Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Selecciona", "Conversión de moneda", "Conversión de temperatura","Conversión de Unidades de distancia" }, "Selecciona")).toString();

                switch (opcion) {
                    case "Conversión de moneda" -> {
                        do {
                            cantidad = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
                            montoIngresado = Double.parseDouble(cantidad);

                        } while (montoIngresado == 0);
                        ConversionMoneda(montoIngresado);
                    }
                    case "Conversión de temperatura" -> {
                        cantidad = JOptionPane.showInputDialog("Ingresa los grados a converitr  ");
                        montoIngresado = Double.parseDouble(cantidad);
                        ConversionTemperatura(montoIngresado);
                    }
                    case "Conversión de Unidades de distancia" -> {
                        cantidad = JOptionPane.showInputDialog("Ingresa número de unidades a convertir ");
                        monto = Double.parseDouble(cantidad);
                        ConversionUnidades(monto);
                    }
                    case "Selecciona" -> JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
                }
                continuar=JOptionPane.showInternalOptionDialog(null, "¿Deseas continuar?", "Continuar", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, arreglo,"Continuar");

            } while (continuar==0);

        }
        catch (Exception ignored) {

        } finally {
            JOptionPane.showMessageDialog(null, new JLabel("¡Hasta pronto!", JLabel.CENTER), "EXIT", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel("""
                    Desarrollado por\s
                     Alejandro Muñoz\s
                     ONE G4-2023""", JLabel.CENTER), "EXIT", JOptionPane.PLAIN_MESSAGE);
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


        String seleccion;

        seleccion = (JOptionPane.showInputDialog(null, "Seleccione el tipo de conversion que desea hacer.", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "Peso a Dolar", "Peso a Euro", "Peso a Yenes", "Peso a Libras", "Euro a Peso", "Euro a Dolar", "Euro a Libras", "Euro a Yenes", "Dolar a Euro", "Dolar a Peso", "Dolar a Libras", "Dolar a Yenes", "Libras a Peso", "Libras a Dolar", "Libras a Euro", "Libras a Yenes", "Yenes a Peso", "Yenes a Libras", "Yenes a Dolar", "Yenes a Euro"}, "selecciona")).toString();

        switch (seleccion) {
            case "Peso a Dolar" ->
                    JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f", montoIgresado / tasaCOPaUSD) + " Dólares"));
            case "Peso a Euro" ->
                    JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f", montoIgresado / tasaCOPaEUR) + " Euros"));
            case "Peso a Yenes" ->
                    JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f", montoIgresado / tasaCOPaJPY) + " Yenes"));
            case "Peso a Libras" ->
                    JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f", montoIgresado / tasaCOPaGBP) + " Libras esterlinas"));
            case "Euro a Peso" ->
                    JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f", montoIgresado * tasaCOPaEUR) + " Pesos"));
            case "Euro a Dolar" ->
                    JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f", montoIgresado / tasaEURaUSD) + " Dólares"));
            case "Euro a Yenes" ->
                    JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f", montoIgresado * tasaJPYaEUR) + " Yenes"));
            case "Euro a Libras" ->
                    JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f", montoIgresado * tasaGBPaEUR) + "Libras esterlinas"));
            case "Dolar a Peso" ->
                    JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f", montoIgresado * tasaCOPaUSD) + " Pesos"));
            case "Dolar a Euro" ->
                    JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f", montoIgresado * tasaEURaUSD) + " Euros"));
            case "Dolar a Yenes" ->
                    JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f", montoIgresado * tasaJPYaUSD) + " Yenes"));
            case "Dolar a Libras" ->
                    JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f", montoIgresado * tasaGBPaUSD) + " Libras esterlinas"));
            case "Libras a Peso" ->
                    JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f", montoIgresado * tasaCOPaGBP) + " Pesos"));
            case "Libras a Dolar" ->
                    JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f", montoIgresado / tasaGBPaUSD) + " Dólares"));
            case "Libras a Euro" ->
                    JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f", montoIgresado / tasaGBPaEUR) + " Euros"));
            case "Libras a Yenes" ->
                    JOptionPane.showInternalMessageDialog(null, "¥" + (String.format("%.2f", montoIgresado * tasaJPYaGBP) + " Yenes"));
            case "Yenes a Peso" ->
                    JOptionPane.showInternalMessageDialog(null, "COP" + (String.format("%.2f", montoIgresado * tasaCOPaJPY) + " Pesos"));
            case "Yenes a Dolar" ->
                    JOptionPane.showInternalMessageDialog(null, "$" + (String.format("%.2f", montoIgresado / tasaJPYaUSD) + " Dólares"));
            case "Yenes a Euro" ->
                    JOptionPane.showInternalMessageDialog(null, "€" + (String.format("%.2f", montoIgresado / tasaJPYaEUR) + " Euros"));
            case "Yenes a Libras" ->
                    JOptionPane.showInternalMessageDialog(null, "£" + (String.format("%.2f", montoIgresado / tasaJPYaGBP) + " Libras esterlinas"));
            default -> JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
        }
    }

    static void ConversionTemperatura(double temperatura) {

        String seleccion;

        seleccion = (JOptionPane.showInputDialog(null, " ¿Que conversión de temperatura necesita? ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,new Object[] { "Selecciona", "Celcius a Fahrenheit", "Celcius a Kelvin", "De Fahrenheit a Celcius", "De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit" },  "Selecciona")).toString();

        switch (seleccion) {
            case "Celcius a Fahrenheit" -> JOptionPane.showInternalMessageDialog(null, ((temperatura * 1.8) + 32) + " °F");
            case "Celcius a Kelvin" -> JOptionPane.showInternalMessageDialog(null, (temperatura + 273.15) + " °K");
            case "De Fahrenheit a Celcius" -> JOptionPane.showInternalMessageDialog(null, ((temperatura - 32) / 1.8) + " °C");
            case "De Fahrenheit a Kelvin" -> JOptionPane.showInternalMessageDialog(null, (((temperatura - 32) * 0.55) + 273.15) + " °K");
            case "De Kelvin a Celcius" -> JOptionPane.showInternalMessageDialog(null, (temperatura - 273.15) + " °C");
            case "De Kelvin a Fahrenheit" -> JOptionPane.showInternalMessageDialog(null, (((temperatura - 273.15) * 0.55) + 32) + " °F");
            default -> JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
        }
    }

    static void ConversionUnidades(double unidad){

        String seleccion;

        seleccion = (JOptionPane.showInputDialog(null, " ¿Que conversión de Unidades de distancia necesita? ", "Unidades de Distancia", JOptionPane.PLAIN_MESSAGE, null,new Object[] { "Selecciona", "Milimetros a Centimetros", "Milimetros a Metros", "Milimetros a Kilometros", "Centimetros a Milimetros", "Centimetros a Metros", "Centimetros a Kilometros", "Metros a Milimetros", "Metros a Centimetros", "Metros a Kilometros", "Kilometros a Milimetros", "Kilometros a Centimetros", "Kilometros a Metros", "Kilometros a Millas", "Millas a Kilometros", "Centimetros a Pulgadas", "Pulgadas a Centimetros", "Metros a Yardas", "Yardas a Metros"},  "Selecciona")).toString();

        switch (seleccion) {
            case "Milimetros a Centimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 10) + " Centimetros"));
            case "Milimetros a Metros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.4f", unidad / 1000) + " Metros"));
            case "Milimetros a Kilometros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (unidad / 1000000) + " Kilometros");
            case "Centimetros a Milimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 10) + " Milimetros"));
            case "Centimetros a Metros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 100) + " Metros"));
            case "Centimetros a Kilometros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 100000) + " Kilometros"));
            case "Metros a Milimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 1000) + " Milimetros"));
            case "Metros a Centimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 100) + " Centimetros"));
            case "Metros a Kilometros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 1000) + " Kilometros"));
            case "Kilometros a Milimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 1000000) + " Milimetros"));
            case "Kilometros a Centimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 100000) + " Centimetros"));
            case "Kilometros a Metros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 1000) + " Metros"));
            case "Kilometros a Millas" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 1.609) + " Millas"));
            case "Millas a Kilometros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 1.609) + " Kilometros"));
            case "Centimetros a Pulgadas" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 2.54f) + " Pulgadas"));
            case "Pulgadas a Centimetros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 2.54f) + " Centimetros"));
            case "Metros a Yardas" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad * 1.094f) + " Yardas"));
            case "Yardas a Metros" ->
                    JOptionPane.showInternalMessageDialog(null, " " + (String.format("%.2f", unidad / 1.094f) + " Yardas"));
            default -> JOptionPane.showInternalMessageDialog(null, "Selecciona un opción válida ");
        }


    }
}


