
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{
    public JPanel panel;
    
    public Ventana(){
        setSize(500,500); //Establecemos el tamaño de la ventana
        setTitle("El mejor titulo"); //Establecemos el titulo de la ventana
        //setLocation(100,200); //Establecemos la posicion inicial de la ventana
        //setBounds(100, 200, 500, 500); //Establecemos la posicion inicial y el tamaño
        setLocationRelativeTo(null); //Establecemos la ventana en el centro
        
        //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
        setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo
        
        //this.getContentPane().setBackground(Color.BLUE); //Establecer el color de la ventana
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
    
    private void iniciarComponentes(){
        colocarPaneles();        
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesDeActivacion();
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDesplegables();
        //colocarCampoDeContraseña();
        //colocarTablas();
        colocarListas();
    }
    
    private void colocarPaneles(){
        panel = new JPanel(); //Creacion de un panel
        //panel.setBackground(Color.GREEN); //Establecemos el color del panel
        panel.setLayout(null); //Desactivando el Diseño
        this.getContentPane().add(panel); //Agregamos el panel a la ventana 
    }
    
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //Creamos una etiqueta
        etiqueta.setText("Mundial 2018"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos la alineacion horizontal del texto
        etiqueta.setForeground(Color.BLACK); //Establecemos el color de la letra
        //etiqueta.setOpaque(true); //Establecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.BLACK); //Cambiamos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black",0,40)); //Establecemos la fuenta del texto
        panel.add(etiqueta); //Agregamos la etiqueta al panel
        
        //Etiqueta 2 - etiqueta tipo imagen
        
        ImageIcon imagen = new ImageIcon("balonMundial.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80, 90, 300, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        //Boton 1 - boton de texto
        JButton boton1 = new JButton();
        boton1.setText("Click"); //Establecemos un texto al botón
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true); //Establecemos el encendido del botón
        boton1.setMnemonic('a'); //Establecemos alt + letra 
        boton1.setForeground(Color.BLUE); //Establecemos el color de la letra del botón
        boton1.setFont(new Font("cooper black",3,20)); //Establecemos la fuente de la letra del botón
        panel.add(boton1);        
        
        //Boton 2 - boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        //boton2.setOpaque(true);
        ImageIcon clicAqui = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE); //Establecemos el color de fondo del boton
        panel.add(boton2);
        
        //Boton 3 - boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4,false));
        panel.add(boton3);
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Programación");
        radioBoton1.setFont(new Font("cooper black",0,20));
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2",false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3",false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }

    private void colocarBotonesDeActivacion(){
        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1",true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);
        
        JToggleButton botonActivacion2 = new JToggleButton("Opcion 2",false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);
        
        JToggleButton botonActivacion3 = new JToggleButton("Opcion 3",false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);
        
        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
    }
    
    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setText("Hola...");
        
        System.out.println("Texto en la caja: "+ cajaTexto.getText());
        panel.add(cajaTexto);
    }
    
    private void colocarAreasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aqui...");
        areaTexto.append("\nEscribe por aqui..."); //Añade mas texto al area
        areaTexto.setEditable(true); //Editar el area de texto
        
        System.out.println("El texto es: "+ areaTexto.getText());
        panel.add(areaTexto);
        
        //Barras de desplazamiento
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamiento.setBounds(20, 20, 300, 200);
        //barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasDesplazamiento);
    }
    
    private void colocarCasillasDeVerificacion(){
        JCheckBox casillaVerificacion1 = new JCheckBox("Leche",true);
        casillaVerificacion1.setEnabled(true);
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2 = new JCheckBox("Galletas");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3 = new JCheckBox("Yogurt");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);
        
        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);
        
    }
    
    private void colocarListasDesplegables(){
        /*String [] paises = {"Perú","Colombia","Paraguay","Ecuador"};
        
        JComboBox listaDesplegable = new JComboBox(paises);
        listaDesplegable.setBounds(20, 20, 100, 30);
        
        listaDesplegable.addItem("Argentina"); //Añadir objetos a tu lista desplegable
        listaDesplegable.setSelectedItem("Paraguay"); //Seleccionar el primer objeto visto
        panel.add(listaDesplegable);*/
        
        Persona persona1 = new Persona("Alejandro Taboada",21,"Peruano");
        Persona persona2 = new Persona("Tania Bustamante",20,"Argentina");
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);
        
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        
        listaDesplegable.setBounds(20, 20, 200, 30);
        panel.add(listaDesplegable);
    }
    
    private void colocarCampoDeContraseña(){
        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(20, 20, 150, 30);
        campoContraseña.setText("programacion");
        panel.add(campoContraseña);
        
        String contraseña = "";
        
        for(int i=0;i<campoContraseña.getPassword().length;i++){
            contraseña += campoContraseña.getPassword()[i];
        }
        
        System.out.println("Contraseña: "+ contraseña);
    }
    
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        String [] persona1 = {"Alejandro","21","Peruano"};
        String [] persona2 = {"Rosa","22","Mexicana"};
        String [] persona3 = {"Maria","25","Paraguaya"};
        String [] persona4 = {"Pedro","20","Peruano"};
        String [] persona5 = {"Nayza","22","Uruguaya"};
        String [] persona6 = {"Juan","18","Chileno"};
        String [] persona7 = {"Damaris","19","Paraguaya"};
        String [] persona8 = {"Luis","20","Ecuatoriano"};
        String [] persona9 = {"Estefany","20","Mexicana"};
        String [] persona10 = {"Jose","21","Mexicano"};
        String [] persona11 = {"Eddy","23","Brasileño"};
        String [] persona12 = {"Ursula","24","Chilena"};
        String [] persona13 = {"Katty","20","Colombiana"};
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);        
        
        JTable tabla = new JTable(modelo);
        
        tabla.setBounds(20, 20, 300, 200);
        panel.add(tabla);
        
        JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
    
    private void colocarListas(){
        DefaultListModel modelo = new DefaultListModel();
        
        modelo.addElement(new Persona("Alejandro Taboada",21,"Peruano"));
        modelo.addElement(new Persona("Estefany Davila",20,"Mexicana"));
        modelo.addElement(new Persona("Andres Bustamante",21,"Paraguayo"));
        modelo.addElement(new Persona("Carola Muñoz",19,"Chilena"));
        modelo.addElement(new Persona("Vanessa Ortiz",22,"Colombiana"));
        modelo.addElement(new Persona("Jose Gonzáles",21,"Peruano"));
        modelo.addElement(new Persona("Jorge Balarezo",22,"Uruguayo"));
        modelo.addElement(new Persona("Maicol Huaman",20,"Argentina"));
        modelo.addElement(new Persona("Florencia Sánchez",21,"Ecuatoriana"));
        modelo.addElement(new Persona("Gonzalo Ruiz",22,"Uruguayo"));
        modelo.addElement(new Persona("Luis Izaga",21,"Argentino"));
        modelo.addElement(new Persona("Noelia Portaño",20,"Peruana"));
        modelo.addElement(new Persona("Juan Torres",19,"Brasileño"));
        modelo.addElement(new Persona("Karu Higoa",21,"EEUU"));
        modelo.addElement(new Persona("Flor Gonzaga",22,"Mexicana"));
        modelo.addElement(new Persona("Miguel Sanchez",20,"Peruano"));
        modelo.addElement(new Persona("Josué Flores",20,"Uruguayo"));
        modelo.addElement(new Persona("Kimberly Santos",21,"Paraguaya"));
        modelo.addElement(new Persona("Manolo Bambo",22,"Cubano"));
        modelo.addElement(new Persona("Paulo Betancur",20,"Argentino"));
        modelo.addElement(new Persona("Daniela Jordan",22,"Colombiana"));
        
        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    }
}
