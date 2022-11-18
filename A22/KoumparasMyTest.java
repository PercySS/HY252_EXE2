package csd.uoc.gr.A22;

public class KoumparasMyTest {
    public static void main(String[] args) throws KoumparasIsBrokenException, KoumparasIsFullException, KoumparasIsNotBrokenException {
       int coin = 2;
       int bill = 5;
//
//        Koumparas koump1 = new Koumparas();
//        koump1.addMoney(coin, bill);
//        koump1.breakKoumparas();
//
//        //must not throw an exception
//        System.out.println(koump1.checkWorth());

        Koumparas koump2 = new Koumparas(coin, bill);
        koump2.addBill(bill);
        koump2.addCoin(coin);
        //must throw not broken exception;
        double worth = koump2.checkWorth();
        System.out.println(worth);

//        Koumparas koump3 = new Koumparas();
//        koump3.breakKoumparas();
//        // must throw koump3 is broken exception
//        koump3.addMoney(coin, bill);
//
//        Koumparas koump4 = new Koumparas();
//        for (int i = 0; i < 999; i++) {
//            koump4.addCoin(1);
//        }
//        //must throw koumparas is full exception
//        koump4.addCoin(1);
    }
}
