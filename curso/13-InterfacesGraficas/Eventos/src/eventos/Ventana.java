
package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo; 
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    
    public Ventana(){
        setBounds(50, 50, 500, 500); //Posicion y tamaño de la ventana
        setTitle("Eventos"); //Título de la ventana
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que se detenga la ejecución al cerrar
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        //colocarEtiqueta();
        colocarCajaDeTexto();
        colocarAreaTexto();
        //colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null); //Desactivamos el diseño del panel
        this.add(panel);
        
        //eventoDeMovimientoRaton();
        //eventoRuedaDelRaton();
    }
    
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black",0,18));
        panel.add(etiqueta);
    }
    
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 30, 150, 30);
        panel.add(cajaTexto);
        
        eventosDelTeclado();
    }
    
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(230,30,200,300);
        panel.add(areaTexto);
        
        JScrollPane scroll = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(230,30,200,300);
        panel.add(scroll);        
    }
    
    private void colocarBoton(){
        boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        //eventoOyenteDeAccion();
        //eventoOyenteDeRaton();
        
    }
    
    private void eventoOyenteDeAccion(){
        //Agregando Evento de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("Hola"+cajaTexto.getText());
            }
        };
        
        boton.addActionListener(oyenteDeAccion);
    }
    
    private void eventoOyenteDeRaton(){
        //Agregando oyente de Raton - MouseListener
        MouseListener oyenteDeRaton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
                if(me.isAltDown()){
                    areaTexto.append("Alt\n");
                }
                else if(me.isControlDown()){
                    areaTexto.append("Control\n");
                }
                else if(me.isShiftDown()){
                    areaTexto.append("Shift\n");
                }
                else if(me.isMetaDown()){
                    areaTexto.append("Click derecho\n");
                }
                else{
                    areaTexto.append("Click izquierdo\n");
                }
                
                if(me.getClickCount() == 2){
                    areaTexto.append("Doble click\n");
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //areaTexto.append("mouseExited\n");
            }
        };
        
        boton.addMouseListener(oyenteDeRaton);
    }
    
    private void eventoDeMovimientoRaton(){
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent me) {
                areaTexto.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                areaTexto.append("mouseMoved\n");
            }
        };
        
        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }
    
    private void eventoRuedaDelRaton(){
        MouseWheelListener ruedaRaton = new MouseWheelListener() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {
                if(mwe.getPreciseWheelRotation() == -1){
                    areaTexto.append("Rueda hacia arriba\n");
                }
                if(mwe.getPreciseWheelRotation() == 1){
                    areaTexto.append("Rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(ruedaRaton);
    }
    
    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
                //areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //areaTexto.append("keyReleased\n");
                if(ke.getKeyChar() == 'p'){
                    areaTexto.append("Letra p\n");
                }
                if(ke.getKeyChar() == '\n'){
                    areaTexto.append("Enter\n");
                }
                if(ke.getKeyChar() == ' '){
                    areaTexto.append("Espacio\n");
                }
            }
        };
        
        cajaTexto.addKeyListener(eventoTeclado);
    }
}
