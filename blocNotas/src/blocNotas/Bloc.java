package blocNotas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class Bloc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bloc frame = new Bloc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bloc() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 282);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Archivo = new JMenu("Archivo");
		menuBar.add(Archivo);
		
		JMenuItem nuevo = new JMenuItem("Nuevo");
		Archivo.add(nuevo);
		
		JMenuItem abrir = new JMenuItem("Abrir..");
		Archivo.add(abrir);
		
		JMenuItem guardar = new JMenuItem("Guardar..");
		Archivo.add(guardar);
		
		JMenuItem salir = new JMenuItem("Salir");
		Archivo.add(salir);
		
		JTextArea notas = new JTextArea();
		getContentPane().add(notas, BorderLayout.CENTER);
		
		nuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				notas.setText("");
				
			}
		});
		
		 abrir.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JFileChooser fileChooser = new JFileChooser();
	                int seleccion = fileChooser.showOpenDialog(Bloc.this);

	                if (seleccion == JFileChooser.APPROVE_OPTION) {
	                    File file = fileChooser.getSelectedFile();
	                    try {
	                        FileReader reader = new FileReader(file);
	                        StringBuilder builder = new StringBuilder();
	                        char[] buffer = new char[4096];
	                        int bytesRead;

	                        while ((bytesRead = reader.read(buffer)) != -1) {
	                            builder.append(buffer, 0, bytesRead);
	                        }

	                        reader.close();
	                        notas.setText(builder.toString());
	                    } catch (IOException ex) {
	                        ex.printStackTrace();
	                    }
	                }
	            }
	        });
		
		guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int seleccion = fileChooser.showSaveDialog(Bloc.this);

                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        FileWriter guardar = new FileWriter(file);
                        guardar.write(notas.getText());
                        guardar.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
		
		salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		
		
		
	}

}
