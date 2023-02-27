import javax.swing.*;
public class ConversorMoneda {
    /*public static void main(String[] args) {
        //Definición de tasas de cambio a Febrero 22 de 2023.
        //Se van a manejar las monedas de Estados unidos, Japon, Union Europea, Reino Unido y Colombia.
        double tasaCOPaUSD = 4896.18;
        double tasaCOPaEUR = 5199.41;
        double tasaCOPaJPY = 36.32;
        double tasaCOPaGBP = 5904.60;
        double tasaJPYaGBP = 162.48;
        double tasaJPYaEUR = 143.14;
        double tasaJPYaUSD = 134.81;
        double tasaGBPaUSD = 0.83;
        double tasaGBPaEUR = 0.88;
        double tasaEURaUSD = 0.88;
        double mismaTasadeCambio = 1;

        Object[] opcionesMoneda = {"1. Peso colombiano (COP)", "2. Dolar Estadounidense (USD)", "3. Yen Japones (JPY)", "4. Euro (EUR)", "5. Libra Esterlina (GBP)"};
        Object seleccionA = JOptionPane.showInputDialog(null, "Seleccione la moneda de origen", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);
        Object seleccionB = JOptionPane.showInputDialog(null, "Seleccione a que moneda desea convertir", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]);

        if(seleccionA == null || seleccionB == null){
            JOptionPane.showMessageDialog(null, "ERROR");
            return;
        }

        double resultado;
        double cantidad;

        switch (seleccionA + "a" + seleccionB ){

            case "COPaUSD"-> {
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en COP"));
                resultado = cantidad*tasaCOPaUSD;
                JOptionPane.showMessageDialog(null, String.format("%.2f", cantidad) + " USD equivalen a " + String.format("%.2f", resultado) + " USD.");
            }
            case "COPaEUR"-> {
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en COP"));
                resultado = cantidad*tasaCOPaEUR;
                JOptionPane.showMessageDialog(null, String.format("%.2f", cantidad) + " EUR equivalen a " + String.format("%.2f", resultado) + " USD.");
            }


        }
    }*/


    static void ConversionMoneda(double montoIngresado) {
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
                        ConversionMoneda(montoIngresado);

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
            System.exit(0);
        }

    }


}
