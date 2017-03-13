package Cartas;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener{
    private JButton boton;
    private FlowLayout flayout = new FlowLayout();
    private Carta label,info;
    private JLabel texto;

    public Interfaz() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(flayout);
        
        boton = new JButton("Generar carta");
        add(boton);
        boton.addActionListener(this);
        
        label = new Carta();
        label.setIcon(null);
        add(label);
        
        texto = new JLabel();
        add(texto);
    }
    
    public static void main(String[] args) {
        Interfaz g = new Interfaz();
        g.setVisible(true);
        g.setBounds(300, 300, 300, 430);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        int a = r.nextInt(4);
        
        //PARA QUE FUNCIONE EN CLASE
        /*
        if(a==0){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\rombos\\rey.jpg"));
                    break;
            }
        }
        
        if(a==1){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\corazones\\rey.jpg"));
                    break;
            }
        }
        
        if(a==2){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\picas\\rey.jpg"));
                    break;
            }
        }
        
        if(a==3){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("C:\\Users\\almc\\Documents\\NetBeansProjects\\Clases\\src\\Cartas\\baraja\\treboles\\rey.jpg"));
                    break;
            }
        }
        */
        
        //PARA QUE FUNCIONE EN CASA
        
        if(a==0){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\rombos\\rey.jpg"));
                    break;
            }
        }
        
        if(a==1){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\corazones\\rey.jpg"));
                    break;
            }
        }
        
        if(a==2){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\picas\\rey.jpg"));
                    break;
            }
        }
        
        if(a==3){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\as.jpg"));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\dos.jpg"));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\tres.jpg"));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\cuatro.jpg"));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\cinco.jpg"));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\seis.jpg"));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\siete.jpg"));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\ocho.jpg"));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\nueve.jpg"));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\diez.jpg"));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\jota.jpg"));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\reina.jpg"));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon("D:\\JuanCarlos\\Documentos\\NetBeansProjects\\JavaApplication5\\src\\Cartas\\baraja\\treboles\\rey.jpg"));
                    break;
            }
        }
        
        texto.setText(info.toString());
//        JOptionPane.showMessageDialog(this, info.toString());
    }
}