package Multithreading;

public class multithreding {
    static class Massi extends Thread{
        public void run(){
            for(int i = 0; i < 5; i++){
                System.out.println("massi");
            }
        }

    }
    public static void main(String[] args) {
        Massi massi = new Massi();
        massi.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Randlo");

        }

    }
}
