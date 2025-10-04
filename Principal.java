import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    private JFrame frame;
    private Registro registro;
    private JTextArea textArea;
    private JComboBox<String> comboBox;
    private JTextField txtNombre;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal window = new Principal();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Principal() {
        registro = new Registro(); // inicializar el modelo
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("Simulador de Procesos");
        lblTitulo.setBounds(220, 10, 200, 20);
        frame.getContentPane().add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre del Proceso:");
        lblNombre.setBounds(30, 50, 150, 20);
        frame.getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(160, 50, 150, 20);
        frame.getContentPane().add(txtNombre);

        JLabel lblTipo = new JLabel("Tipo de Proceso:");
        lblTipo.setBounds(30, 90, 120, 20);
        frame.getContentPane().add(lblTipo);

        comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"CPU", "Entrada/Salida", "Daemon"}));
        comboBox.setBounds(160, 90, 150, 20);
        frame.getContentPane().add(comboBox);

        JButton btnAgregar = new JButton("Agregar Proceso");
        btnAgregar.setBounds(350, 50, 180, 25);
        frame.getContentPane().add(btnAgregar);

        JButton btnEjecutar = new JButton("Ejecutar Procesos");
        btnEjecutar.setBounds(350, 90, 180, 25);
        frame.getContentPane().add(btnEjecutar);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(30, 140, 500, 200);
        frame.getContentPane().add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        // Agrega procesos
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText().trim();
                if(nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Ingrese un nombre para el proceso.");
                    return;
                }

                int pid = registro.getProcesos().size() + 1;
                String tipo = comboBox.getSelectedItem().toString();

                Procesos nuevo = null;
                switch(tipo) {
                    case "CPU": nuevo = new ProcesosCPU(pid, nombre); break;
                    case "Entrada/Salida": nuevo = new ProcesosIO(pid, nombre); break;
                    case "Daemon": nuevo = new Daemons(pid, nombre); break;
                }

                registro.setProceso(nuevo);
                textArea.append("Agregado: " + nuevo.toString() + "\n\n");
                txtNombre.setText("");
            }
        });

        // Acción para ejecutar procesos
        btnEjecutar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PlanificadorP planificador = new PlanificadorP(registro);
                String resultado = planificador.Ejecutar();
                textArea.append("=== Ejecución de Procesos ===\n" + resultado + "\n");
            }
        });
    }
}
