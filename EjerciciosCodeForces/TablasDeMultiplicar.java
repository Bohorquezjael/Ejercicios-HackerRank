import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int limit = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Ingresa el limite a imprimir de los numeros pares"));
        JOptionPane.showMessageDialog(null, new TablasDeMultiplicar(limit).scroll, "Las Tablas", 0);
    }

    JTextArea  area;
    JScrollPane scroll;
    public TablasDeMultiplicar(int n){
        area = new JTextArea(10,35);
        scroll = new JScrollPane(area);
        imprime(n);
    }
    public void imprime(int n){
        area.append("\tLos numeros pares del 0 al " + n + " son: \n");
        area.append("************************************************************************\n");
    for(int i = 0; i <= n; i += 2){
        area.append("|||\t\t" + i + "\t\t  ||||\n");
    }
    area.append("************************************************************************\n");
    }

}
