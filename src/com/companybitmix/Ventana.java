package com.companybitmix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiquita, etiqueta2;
    private JTextField campo;
    private JButton jugar;
    private JDialog jdi;

    public Ventana() {
        super("juego de numeros");
        etiquita = new JLabel("dime numero");
        campo = new JTextField(6);//tamaño de la barra de texto
        jugar = new JButton("jugar");
        jdi = new JDialog(this);
        jdi.setSize(500, 600);
        etiqueta2 = new JLabel("instrucciones");

        FlowLayout f = new FlowLayout();
        setLayout(f);
        //add(etiquita, campo);
        add(etiquita);
        add(campo);
        add(jugar);
        jdi.add(etiqueta2);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                jugar();
            }
        });
    }

    public void jugar() {

        String valor = campo.getText();//devuelve lo que tenemos en el campo
        int numero = Integer.parseInt(valor);
        numero++;
        etiqueta2.setText("mi numero es " + numero + "te gane ");
        jdi.setVisible(true);
    }



}
