
import javax.swing.JOptionPane;

/**
 * @author andresnitolamoreno
 * Fecha: viernes 09 de junio 2023
 * Materia: Introducción al Desarrollo de Software
 * Corporacion universitaria remington
 */
public class principal {

    public static void main(String[] args) {
        //Declaracion constantes
        final float ckelvin = 273.15f;
        final int cfahrenheit = 32;
        //Declaracion variables
        int gradosc = 0, gradosf = 0, cdolares = 0, numero = 0, cuadrado = 0;
        float tkelvin;
        double trm = 0, total_pesosco = 0, cubo = 0, area = 0, base = 0, altura = 0, radio = 0;
        int select = -1;


        //Mientras la opción elegida sea 0, preguntamos al usuario
        while (select != 0) {
            //Try catch para controlar errores al ingresar datos
            try {
                String lectura = JOptionPane.showInputDialog(null, "************************\nElige opción:\n1. Convertir grados centígrados a Kelvin." +
                        "\n2. Convertir grados centígrados a Farenheit.\n" +
                        "3. Convertir dólares a pesos.\n" +
                        "4. Que halle el cuadrado de un número entero.\n" +
                        "5. Que halle el cubo de un número entero.\n" +
                        "6. Que halle el área de un cuadrado.\n" +
                        "7. Que halle el área de un triángulo.\n" +
                        "8. Que halle el área de la circunferencia.\n" +
                        "0. Salir\n************************");
                //Recoger una variable por consola
                select = Integer.parseInt(lectura);

                //Switch case
                switch (select) {
                    case 1://Convertir grados centígrados a Kelvin.
                        //Entrada de datos
                        gradosc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor en grados centigrados: "));
                        //Proceso datos
                        tkelvin = gradosc + ckelvin;
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, gradosc + " Grados centigrados convertidos a  kelvin es: " + tkelvin);
                        break;
                    case 2://Convertir grados centígrados a Farenheit
                        //Entrada de datos
                        gradosc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor en grados centigrados"));
                        //Proceso datos
                        gradosf = (gradosc * 9 / 5) + cfahrenheit;
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, gradosc + " Grados centigrados convertidos a  fahrenheit es: " + gradosf);
                        break;
                    case 3://Convertir dólares a pesos
                        //Entrada de datos
                        trm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el TRM de hoy: "));
                        cdolares = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de dólares estadounindenses: "));
                        //Proceso datos
                        total_pesosco = trm * cdolares;
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, cdolares + " dólares estadounidenses convertidos a pesos colombianos es: " + total_pesosco);
                        break;
                    case 4://Que halle el cuadrado de un número entero
                        //Entrada de datos
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea elevar al cuadrado: "));
                        //Proceso datos
                        cuadrado = numero * numero;
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, numero + " Elevado al cuadrado es: " + cuadrado);
                        break;
                    case 5://Que halle el cubo de un número entero.
                        //Entrada de datos
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea elevar al cubo: "));
                        //Proceso datos
                        cubo = Math.pow(numero, 3);
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, numero + " Elevado al cuadrado es: " + cubo);
                        break;
                    case 6://Que halle el área de un cuadrado
                        //Entrada de datos
                        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base o altura del cuadrado: "));
                        //Proceso datos
                        area = base * base;
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, " El area del cuadrado es: " + area);
                        break;
                    case 7://Que halle el área de un triángulo.
                        //Entrada de datos
                        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo: "));
                        //Proceso datos
                        area = base * altura;
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, " El area del triangulo es: " + area);
                        break;
                    case 8://Que halle el área de la circunferencia.
                        //Entrada de datos
                        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la radio de la circunferencia: "));
                        //Proceso datos
                        area = Math.PI * (Math.pow(radio, 2));
                        //Salida de informacion
                        JOptionPane.showMessageDialog(null, " El area de la circunferencia es: " + area);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Hasta pronto!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingresa una opcion valida");
                        break;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, ingresa un valor correcto");
            }
        }


    }

}
