package com.company;

public class itemsystem {
    public int capacity; /* capacity bertipe data int*/
    public Object[]data; /* data bertipe data object*/
    public int top;      /* top bertipe data int*/




    public itemsystem(int size){  /* Constructor dari stack*/
        top = -1;
        data = new Object[size];
        capacity = size;
    }
    public boolean isFull(){    /* Untuk mengecek full dari stack*/
        return top == capacity - 1;
    }

    public boolean isEmpty(){  /* Untuk mengecek empty dari stack*/
        return top == -1;
    }
    public void push(Object x){ /* push untuk memasukan data kedalam stack */
        if(isFull()){ /* Mengecek full atau tidak sebelum memasukan data */
            System.out.println("Inventory Penuh!!!");
        }else{
            data[++top] = x; /* Memasukan data ke stack yang paling atas */
        }
    }
    public void printStack(){ /* print untuk melihat semua data yang ada di stack */
        if(isEmpty()){ /* Mengecek stack empty atau tidak sebelum print data */
            System.out.println("Inventory Kosong!!!");
        }else{
            for(int i = top; i >= 0; i--){
                System.out.print(data[i] + " "); /* Menampilkan data yang ada dalam stack */
            }
            System.out.println();
        }
    }
    public Object pop(){ /* Untuk Mengambil data yang ada dalam stack */
        if(isEmpty()){ /* Mengecek empty atau tidak sebelum print data */
            System.out.println("Stack Kosong!!!");
            return 0;
        }
        System.out.println("Mengeluarkan " + data[top] + " Dari Stack");
        return data[top--]; /* Menge;iarkan data paling atas dari stack  */
    }
    public void clear(){
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            top = -1;
        }
    }

}

