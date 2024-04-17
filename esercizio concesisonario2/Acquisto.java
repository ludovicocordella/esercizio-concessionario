import java.util.ArrayList;
import java.util.Scanner;

class Login {

    // costr princ -- nome e pass stringhe -- storico arraylist --int budget int id
    // int spesa
    // costr storico vuoto e spesa vuota

    String nome;
    String password;
    ArrayList<String> storico;
    int budget;
    int id;
    int spesa;
    int ultimoid = 0;

    // costruttore 1: tutti i parametri
    public Login(String nome, String password, int budget, int spesa, ArrayList<String> storico) {
        this.nome = nome;
        this.password = password;
        this.id = ++ultimoid;
        this.spesa = spesa;
        this.budget = budget;
        this.storico = storico;

    }

    // costruttore 2: 3 parametri da inserire, 2 fissi a 0 da settare
    public Login(String nome, String password, int budget) {
        this.nome = nome;
        this.password = password;
        this.id = ++ultimoid;
        this.budget = budget;
        this.spesa = 0;
        this.storico = new ArrayList<String>();

    }

    public void aggiungiveicolo(String veicolo) {
        this.storico.add(veicolo);
    }

    public void aggiornabudget(int nuovobud) {
        this.budget = nuovobud;
    }

    public void aggiornaspesa(int nuovaspesa) {
        this.spesa = nuovaspesa;
    }

    // getnome, getbudget getstorico
    public String getNome() {
        return nome;
    }

    public ArrayList<String> getStorico() {
        return storico;
    }

    public int getBudget() {
        return budget;
    }

    public int getSpesa() {
        return spesa;
    }

    public int getId() {
        return id;
    }

    Scanner parole = new Scanner(System.in);
    // registrazione direttamente nel main

    // metodo login
    // controllo se nome e pass corrispondon
    void controllologin() {
        int j = 0;
        System.out.println("fai il login");
        while (j < 3) {
            System.out.println("inserisci nome");
            String rispostaNome = parole.nextLine();
            System.out.println("inserisci password");
            String rispostaPass = parole.nextLine();
            if (rispostaNome.equals(nome) && rispostaPass.equals(password)) {
                System.out.println("hai effettuato l'accesso");
                j = 4;
            } else {
                j++;
                System.out.println("Credenziali sbagliate, riprovare");
            }
        }

    }

}

class Catalogo extends Login {
    public Catalogo(String nome, String password, int budget) {
        super(nome, password, budget);
    }

    public ArrayList<String> arrayLmacchine() {
        ArrayList<String> macchine = new ArrayList<String>();

        macchine.add("Volvo");
        macchine.add("BMW");
        macchine.add("Ford");
        macchine.add("Mazda");
        return macchine;
    }

    public ArrayList<Integer> arrayLmacchineprezzi() {
        ArrayList<Integer> macchineprezzi = new ArrayList<Integer>();
        macchineprezzi.add(20000);
        macchineprezzi.add(35000);
        macchineprezzi.add(12000);
        macchineprezzi.add(16000);

        return macchineprezzi;
    }

    public ArrayList<String> arrayLmoto() {
        ArrayList<String> moto = new ArrayList<>();
        moto.add("Ducati");
        moto.add("Kawasaki");
        moto.add("Aprilia");
        moto.add("Yamaha");
        return moto;
    }

    public ArrayList<Integer> arrayLmotoprezzi() {
        ArrayList<Integer> motoprezzi = new ArrayList<>();
        motoprezzi.add(2000);
        motoprezzi.add(3500);
        motoprezzi.add(1200);
        motoprezzi.add(1600);

        return motoprezzi;
    }

    public void stampalistaautomoto() {
        
        // print
        ArrayList<String> macchine = arrayLmacchine();
        String volvo = macchine.get(0);
        String bmw = macchine.get(1);
        String ford = macchine.get(2);
        String mazda = macchine.get(3);

        ArrayList<Integer> macchineprezzi = arrayLmacchineprezzi();
        int pvolvo = macchineprezzi.get(0);
        int pbmw = macchineprezzi.get(1);
        int pford = macchineprezzi.get(2);
        int pmazda = macchineprezzi.get(3);

        ArrayList<String> moto = arrayLmoto();
        String ducati = moto.get(0);
        String kawasaki = moto.get(1);
        String aprilia = moto.get(2);
        String yamaha = moto.get(3);

        ArrayList<Integer> motoprezzi = arrayLmotoprezzi();
        int pDucati = motoprezzi.get(0);
        int pKawasaki = motoprezzi.get(1);
        int pAprilia = motoprezzi.get(2);
        int pYamaha = motoprezzi.get(3);

        System.out.println(
                "Gentile cliente, i modelli disponibili sono quelli di seguito elencati, con i rispettivi prezzi:\nAuto:\n"
                        + volvo + " " + pvolvo + "\n" + bmw + " " + pbmw + "\n" + ford + " " + pford + "\n" + mazda
                        + " " + pmazda);
        System.out.println("Moto:\n" + ducati + " " + pDucati + "\n" + kawasaki + " " + pKawasaki + "\n" + aprilia + " "
                + pAprilia + "\n" + yamaha + " " + pYamaha);

    }

    

    // metodo con switch
    void sceltaclienteSwitch() {
        ArrayList<String> macchine = arrayLmacchine();
        ArrayList<Integer> macchineprezzi = arrayLmacchineprezzi();
        ArrayList<String> moto = arrayLmoto();
        ArrayList<Integer> motoprezzi = arrayLmotoprezzi();
       
        Scanner numeri = new Scanner(System.in);

        int w = 0;
        while (w < 1){
            System.out.println(
                    "scrivere auto se si desidera acquistare un auto, moto se si desidera acquistare una moto:");
            String scelta = numeri.nextLine();
            if (scelta.equals("auto")) {

                System.out.println("Premi i codici corrispondenti al veicolo che si desidera acquistare ");
                System.out.println("premere 1 per " + macchine.get(0));
                System.out.println("premere 2 per " + macchine.get(1));
                System.out.println("premere 3 per " + macchine.get(2));
                System.out.println("premere 4 per " + macchine.get(3));
                w = 2;
            } else if (scelta.equals("moto")) {
                System.out.println("Premi i codici corrispondenti al veicolo che si desidera acquistare ");
                System.out.println("premere 5 per " + moto.get(0));
                System.out.println("premere 6 per " + moto.get(1));
                System.out.println("premere 7 per " + moto.get(2));
                System.out.println("premere 8 per " + moto.get(3));
                w = 2;

            } else {
                System.out.println("Errore, effettuare una scelta valida");
            }
        }

        int menu = numeri.nextInt();
        switch(menu){
            
            case 1:
                if ((budget - macchineprezzi.get(0))<0){
                    System.out.println("non hai abbastanza budget");
                    break;
                }else{
                aggiungiveicolo(macchine.get(0));
                aggiornabudget(budget - macchineprezzi.get(0));
                aggiornaspesa(spesa + macchineprezzi.get(0));
                break;}

            case 2:
            if ((budget - macchineprezzi.get(1))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(macchine.get(1));
            aggiornabudget(budget - macchineprezzi.get(1));
            aggiornaspesa(spesa+macchineprezzi.get(1));
            break;}

            case 3:
            if ((budget - macchineprezzi.get(2))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(macchine.get(2));
            aggiornabudget(budget - macchineprezzi.get(2));
            aggiornaspesa(spesa+macchineprezzi.get(2));
            break;}

            case 4:
            if ((budget - macchineprezzi.get(3))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(macchine.get(3));
            aggiornabudget(budget - macchineprezzi.get(3));
            aggiornaspesa(spesa+macchineprezzi.get(3));
            break;}

            case 5:
            if ((budget - motoprezzi.get(0))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(moto.get(0));
            aggiornabudget(budget - motoprezzi.get(0));
            aggiornaspesa(spesa+motoprezzi.get(0));
            break;}

            case 6:
            if ((budget - motoprezzi.get(1))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(moto.get(1));
            aggiornabudget(budget - motoprezzi.get(1));
            aggiornaspesa(spesa+motoprezzi.get(1));
            break;}
            case 7:
            if ((budget - motoprezzi.get(2))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(moto.get(2));
            aggiornabudget(budget - motoprezzi.get(2));
            aggiornaspesa(spesa+motoprezzi.get(2));
            break;}
            case 8:
            if ((budget - motoprezzi.get(3))<0){
                System.out.println("non hai abbastanza budget");
                break;
            }else{
            aggiungiveicolo(moto.get(3));
            aggiornabudget(budget - motoprezzi.get(3));
            aggiornaspesa(spesa+motoprezzi.get(3));
            break;}
    }
    }
}

class Promozioni extends Catalogo {
    public Promozioni(String nome, String password, int budget) {
        super(nome, password, budget);
    }

    void sceltaclienteSwitchpromo() {
        ArrayList<String> macchine = arrayLmacchine();
        ArrayList<Integer> macchineprezzi = arrayLmacchineprezzi();
        ArrayList<String> moto = arrayLmoto();
        ArrayList<Integer> motoprezzi = arrayLmotoprezzi();
       
        Scanner numeri = new Scanner(System.in);

        int w = 0;
        while (w < 1)
        {
            System.out.println(
                    "scrivere auto se si desidera acquistare un auto, moto se si desidera acquistare una moto:");
            String scelta = numeri.nextLine();
            if (scelta.equals("auto")) {

                System.out.println("Premi i codici corrispondenti al veicolo che si desidera acquistare ");
                System.out.println("premere 1 per " + macchine.get(0));
                System.out.println("premere 2 per " + macchine.get(1));
                System.out.println("premere 3 per " + macchine.get(2));
                System.out.println("premere 4 per " + macchine.get(3));
                w = 2;
            } else if (scelta.equals("moto")) {
                System.out.println("Premi i codici corrispondenti al veicolo che si desidera acquistare ");
                System.out.println("premere 5 per " + moto.get(0));
                System.out.println("premere 6 per " + moto.get(1));
                System.out.println("premere 7 per " + moto.get(2));
                System.out.println("premere 8 per " + moto.get(3));
                w = 2;

            } else {
                System.out.println("Errore, effettuare una scelta valida");
            }
        }

        int menu = numeri.nextInt();
        switch(menu){
            case 1:
            if ((budget - macchineprezzi.get(0)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {    
            aggiungiveicolo(macchine.get(0));
            aggiornabudget(budget - macchineprezzi.get(0)/2);
            aggiornaspesa(spesa+macchineprezzi.get(0)/2);
            break;}

            case 2:
            if ((budget - macchineprezzi.get(1)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
            aggiungiveicolo(macchine.get(1));
            aggiornabudget(budget - macchineprezzi.get(1)/2);
            aggiornaspesa(spesa+macchineprezzi.get(1)/2);
            break;}

            case 3:
            if ((budget - macchineprezzi.get(2)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
            aggiungiveicolo(macchine.get(2));
            aggiornabudget(budget - macchineprezzi.get(2)/2);
            aggiornaspesa(spesa+macchineprezzi.get(2)/2);
            break;}

            case 4:
            if ((budget - macchineprezzi.get(3)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
            aggiungiveicolo(macchine.get(3));
            aggiornabudget(budget - macchineprezzi.get(3)/2);
            aggiornaspesa(spesa+macchineprezzi.get(3)/2);
            break;}

            case 5:
            if ((budget - motoprezzi.get(0)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
                aggiungiveicolo(moto.get(0));
                aggiornabudget(budget - motoprezzi.get(0) / 2);
                aggiornaspesa(spesa + motoprezzi.get(0) / 2);
                break;}

            case 6:
            if ((budget - motoprezzi.get(1)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
                aggiungiveicolo(moto.get(1));
                aggiornabudget(budget - motoprezzi.get(1) / 2);
                aggiornaspesa(spesa + motoprezzi.get(1) / 2);
                break;}
            case 7:
            if ((budget - motoprezzi.get(2)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
                aggiungiveicolo(moto.get(2));
                aggiornabudget(budget - motoprezzi.get(2) / 2);
                aggiornaspesa(spesa + motoprezzi.get(2) / 2);
                break;}
            case 8:
            if ((budget - motoprezzi.get(3)/2)<0){
                System.out.println("non hai abbastanza budget");
                break;}
            else {  
                aggiungiveicolo(moto.get(3));
                aggiornabudget(budget - motoprezzi.get(3) / 2);
                aggiornaspesa(spesa + motoprezzi.get(3) / 2);
                break;}
        }
    }

}

class Acquisto {

    public static void main(String[] args) {

        Scanner parole = new Scanner(System.in);
        Scanner numeri = new Scanner(System.in);
        boolean loop=true;
        boolean loop2=true;

        
        while(loop){
        //registrazione
        System.out.println("registrati");
        System.out.println("inserisci nome");
        String rispostaNome = parole.nextLine();
        System.out.println("inserisci password");
        String rispostaPass = parole.nextLine();
        System.out.println("inserisci budget");
        int rispostaBudget = numeri.nextInt();

    

        // oggetti
        Catalogo catalogo = new Catalogo(rispostaNome, rispostaPass, rispostaBudget);
        Promozioni promozioni = new Promozioni(rispostaNome, rispostaPass, rispostaBudget);

        catalogo.controllologin();
        
        
while(loop2){
        System.out.println("vuoi acquistare? si/premi altro per uscire");
        String rispostaacquisto=parole.nextLine();
        if (rispostaacquisto.equalsIgnoreCase("si")){
            catalogo.stampalistaautomoto();
        

        if (catalogo.getStorico().size() < 3) {
            //System.out.println("errore qui?");
            catalogo.sceltaclienteSwitch();
            System.out.println("il tuo storico è: "+catalogo.getStorico());
            System.out.println("il tuo buddet restante è: "+catalogo.getBudget());
            System.out.println("finora hai speso: "+catalogo.getSpesa());
        } else {
            System.out.println("Hai diritto allo sconto del 50% sul prossimo acquisto");
            promozioni.sceltaclienteSwitchpromo();
            System.out.println("il tuo storico è: "+catalogo.getStorico()+promozioni.getStorico());
            System.out.println("il tuo buddet restante è: "+catalogo.getBudget()+promozioni.getBudget());//non funz
            System.out.println("finora hai speso: "+catalogo.getSpesa()+promozioni.getSpesa()); //non funz
         
        }
    } //chiuso if rispostaacquisto 
    else{
        loop2=false;
        loop=false;
        
    }
} //chiuso while loop2
    } //chiuso while loop

} //chiusura main

}//chiusura class acquisto