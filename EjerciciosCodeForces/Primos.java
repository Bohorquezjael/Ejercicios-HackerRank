import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Primos {

        JTextArea texto;
        JScrollPane barra;

        public Primos() {
            texto = new JTextArea(30, 40);
            barra = new JScrollPane(texto);
        }

        public void imprimir(int n) {
            if (checaPrimo(n)) {
                texto.append("\t" + n + ": Es un numero primo\n");
            } else {
                texto.append("\t" + n + ": No es un numero primo\n");
            }
            
        }

        public static boolean checaPrimo(int n) {
            boolean flag = true;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0 && i != n) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        public static void main(String[] args) {
            Primos p = new Primos();
            for (int i = 1; i <= 100; i++) {
                p.imprimir(i);
            }
            JOptionPane.showMessageDialog(null, p.barra);
        }
    }