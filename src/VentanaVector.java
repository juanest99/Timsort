import javax.swing.*;
import java.awt.*;

public class VentanaVector extends JFrame {

    public VentanaVector(int[] desordenado, int[] ordenado) {
        setTitle("Visualización de Timsort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 350);
        setLocationRelativeTo(null);

        // Fuente mejorada
        Font fuente = new Font("Monospaced", Font.PLAIN, 14);

        // Área del vector desordenado
        JTextArea areaDesordenado = new JTextArea(arrayToString(desordenado));
        areaDesordenado.setFont(fuente);
        areaDesordenado.setEditable(false);
        areaDesordenado.setLineWrap(true);
        areaDesordenado.setWrapStyleWord(true);
        JScrollPane scrollDes = new JScrollPane(areaDesordenado);
        scrollDes.setBorder(BorderFactory.createTitledBorder("🌀 Vector Desordenado"));

        // Área del vector ordenado
        JTextArea areaOrdenado = new JTextArea(arrayToString(ordenado));
        areaOrdenado.setFont(fuente);
        areaOrdenado.setEditable(false);
        areaOrdenado.setLineWrap(true);
        areaOrdenado.setWrapStyleWord(true);
        JScrollPane scrollOrd = new JScrollPane(areaOrdenado);
        scrollOrd.setBorder(BorderFactory.createTitledBorder("✅ Vector Ordenado"));

        // Panel principal con BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(scrollDes);
        panel.add(scrollOrd);

        add(panel);
        setVisible(true);
    }

    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
