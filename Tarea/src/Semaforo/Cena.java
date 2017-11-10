/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author danylee
 */
public class Cena implements Runnable{
    String s;
    
       Semaphore sillas;
       Semaphore tenedores;
       Semaphore cuchillos;
       public Cena(String s, Semaphore sillas, Semaphore tenedores,Semaphore cuchillos)
    {
         
          this.s= s;
          this.sillas=sillas;
          this.tenedores=tenedores;
          this.cuchillos=cuchillos;
    }
     
       public void run()
{
              try {
                   sillas.acquire();
                   cuchillos.acquire();
                   tenedores.acquire();
                   System.out.println("Soy el bombon " + s);
                   long a = (long)(Math.random() * 10000 );
                   Thread.sleep(a);
                   tenedores.release();
                    cuchillos.release();
                   sillas.release();
                  } catch (InterruptedException ex) {

                  }
 }

      public static void main(String[] args)
       {
           Semaphore S = new Semaphore(6);
           Semaphore T = new Semaphore(5);
           Semaphore C = new Semaphore(4);
           
           
           
           Thread t1 = new Thread(new Cena(" chinito1", S ,T,C));
           Thread t2 = new Thread(new Cena(" chinito2", S ,T,C));
           Thread t3 = new Thread(new Cena(" chinito3", S ,T,C));
           Thread t4 = new Thread(new Cena(" chinito4", S ,T,C));
           Thread t5 = new Thread(new Cena(" chinito5", S ,T,C));
           Thread t6 = new Thread(new Cena(" chinito6", S ,T,C));
           Thread t7 = new Thread(new Cena(" chinito7", S ,T,C));
           Thread t8 = new Thread(new Cena(" chinito8", S ,T,C));
           Thread t9 = new Thread(new Cena(" chinito9", S ,T,C));
           Thread t10 = new Thread(new Cena(" chinito10", S ,T,C));
           Thread t11= new Thread(new Cena(" chinito11",S ,T,C));
           Thread t12= new Thread(new Cena(" chinito12", S ,T,C));
           Thread t13 = new Thread(new Cena(" chinito13", S ,T,C));
           Thread t14 = new Thread(new Cena(" chinito14", S ,T,C));
           Thread t15 = new Thread(new Cena(" chinito15", S ,T,C));
           

           
           t1.start();
           t2.start();
           t3.start();
           t4.start();
           t5.start();
           t6.start();
           t7.start();
           t8.start();
           t9.start();
           t10.start();
           t11.start();
           t12.start();
           t13.start();
           t14.start();
           t15.start();

       }

}