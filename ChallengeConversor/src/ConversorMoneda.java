import javax.swing.*;
public class ConversorMoneda {
    public static void main(String[] args) {
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
    }


}
