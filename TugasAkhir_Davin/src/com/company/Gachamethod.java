package com.company;
import java.util.Random;

class Gachamethod {
    Random r = new Random();
    int gacha = r.nextInt();
    TugasAkhir gc = new TugasAkhir();
public Gachamethod () {
    if (gacha < 1.0) { /*Extreme Rare */
        gc.textArea1.setText("Selamat Anda Mendapatkan" +gc.item1.getText());
    }
    else if (gacha < 10.0) { /*Super Rare */
        gc.textArea1.setText("Selamat Anda Mendapatkan" +gc.item2.getText());
    }
    else if (gacha < 20.0) { /* Rare */
        gc.textArea1.setText("Selamat Anda Mendapatkan" +gc.item3.getText());
    }
    else if (gacha < 40.0) {/*Uncommon */
        gc.textArea1.setText("Selamat Anda Mendapatkan" +gc.item4.getText());
    }
    else if (gacha < 70.0) {/*common */
        gc.textArea1.setText("Selamat Anda Mendapatkan" +gc.item5.getText());
    }
}

}

