package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Random;

public class TugasAkhir {
    itemsystem stack = new itemsystem(5);

    public JButton STARTButton;
    public JTextField item1;
    public JTextField chance1;
    public JTextField item2;
    public JTextField item3;
    public JTextField item4;
    public JTextField item5;
    public JLabel labelitem;
    public JLabel labelchance;
    private JButton cekchance;
    private JPanel panelta;
    public JTextArea textArea1;
    private JButton koleksiItemButton;
    private JLabel extremerare;
    private JLabel superrare;
    private JLabel rare;
    private JLabel uncommon;
    private JLabel common;
    private JButton inventoryButton;
    private JButton clearInventoryButton;


    public TugasAkhir() {

        STARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                int gacha = r.nextInt(160);
                String k;
                k = "";
                if (stack.isFull()) { /* Mengecek full atau tidak sebelum memasukan data */
                    textArea1.setText("Inventory Penuh!!!");
                }
                else if (item1.getText().length() == 0){
                    textArea1.setText("Item Harus Diisi");
                }
                else if (item2.getText().length() == 0){
                    textArea1.setText("Item Harus Diisi");
                }
                else if (item3.getText().length() == 0){
                    textArea1.setText("Item Harus Diisi");
                }
                else if (item4.getText().length() == 0){
                    textArea1.setText("Item Harus Diisi");
                }
                else if (item5.getText().length() == 0){
                    textArea1.setText("Item Harus Diisi");
                }
                else {
                    if (gacha < 1.0) { /*Extreme Rare */
                        textArea1.setForeground(Color.RED);
                        textArea1.setText("Selamat Anda Mendapatkan " + item1.getText().toUpperCase(Locale.ROOT));
                        stack.push(item1.getText());
                    } else if (gacha < 10.0) { /*Super Rare */
                        textArea1.setForeground(Color.MAGENTA);
                        textArea1.setText("Selamat Anda Mendapatkan " + item2.getText().toUpperCase(Locale.ROOT));
                        stack.push(item2.getText());
                    } else if (gacha < 50.0) { /* Rare */
                        textArea1.setForeground(Color.orange);
                        textArea1.setText("Selamat Anda Mendapatkan " + item3.getText().toUpperCase(Locale.ROOT));
                        stack.push(item3.getText());
                    } else if (gacha < 100.0) {/*Uncommon */
                        textArea1.setForeground(Color.blue);
                        textArea1.setText("Selamat Anda Mendapatkan " + item4.getText().toUpperCase(Locale.ROOT));
                        stack.push(item4.getText());
                    } else if (gacha < 160.0) {/*common */
                        textArea1.setForeground(Color.green);
                        textArea1.setText("Selamat Anda Mendapatkan " + item5.getText().toUpperCase(Locale.ROOT));
                        stack.push(item5.getText());
                    }
                }
            }
        });

        cekchance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("Berikut adalah chance yang anda miliki :" +
                        " \n" +extremerare.getText()+" 1.0%" +
                        " \n" +superrare.getText()   +" 10.0%" +
                        " \n" +rare.getText()        +" 40.0%" +
                        " \n" +uncommon.getText()    +" 50.0%" +
                        " \n" +common.getText()      +" 60.0%");
            }
        });
        inventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                if(stack.isEmpty()){ /* Mengecek stack empty atau tidak sebelum print data */
                    textArea1.setText("Inventory Kosong!!!");
                }else{
                    for(int i = stack.top; i >= 0; i--){
                        textArea1.append(String.valueOf(stack.data[i] + ", ")); /* Menampilkan data yang ada dalam stack */
                    }
                    System.out.println();
                }
            }
        });
        clearInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                if(stack.isEmpty()){ /* Mengecek empty atau tidak sebelum print data */
                    textArea1.setText("Tidak Ada Item yang akan di clear");
                }
                else {
                    textArea1.setText("Menghapus Inventory.....");
                    stack.top = -1;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SIMULATOR");
        frame.setContentPane(new TugasAkhir().panelta);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setResizable(true);
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

