import java.util.ArrayList;
import java.util.Scanner;

class Login {
    // costr princ -- nome e pass stringhe -- storico arraylist --int budget int id
    // int spesa
    // costr storico vuoto e spesa vuota

    String nome;
    String password;
    ArrayList<String> storico ;
    int budget;
    int id;
    int spesa;

    // costruttore 1: tutti i parametri
    public Login(String nome, String password, int id, int spesa, ArrayList<String> storico) {
        this.nome = nome;
        this.password = password;
        this.id = id;
        this.spesa = spesa;
        this.storico = storico;

    }

    // costruttore 2: 3 parametri da inserire, 2 fissi a 0 da settare
    public Login(String nome, String password, int id) {
        this.nome = nome;
        this.password = password;
        this.id = id;
        this.spesa = 0;
        this.storico = new ArrayList<String>();

    }

    public void aggiungiveicolo(String veicolo) {
        this.storico.add(veicolo);
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
    // metodo registrazione

    // metodo login
    // controllo se nome e pass corrispondon
    void controllologin() {
        int j = 0;
        while (j < 3) {
            System.out.println("inserisci nome");
            String rispostaNome = parole.nextLine();
            System.out.println("inserisci password");
            String rispostaPass = parole.nextLine();
            if (rispostaNome.equals(nome) && rispostaPass.equals(password)) {
                System.out.println("hai effettuato l'accesso");
            } else {
                j++;
            }
        }

    }

}

class Catalogo extends Login {
    public Catalogo(String nome, String password, int id) {
        super(nome, password, id);
    }



    ArrayList <String> macchine = new ArrayList<String>();
    macchine.add("Volvo");
    macchine.add("BMW");
    macchine.add("Ford");
    macchine.add("Mazda");
 
   

    ArrayList <Integer> macchineprezzi = new ArrayList<>();
    macchineprezzi.add(20000);
    macchineprezzi.add(35000);
    macchineprezzi.add(12000);
    macchineprezzi.add(16000);

    String volvo = macchine.get(0);
    String bmw = macchine.get(1);
    String ford = macchine.get(2);
    String mazda = macchine.get(3);
    int pvolvo = macchineprezzi.get(0);
    int pbmw = macchineprezzi.get(1);
    int pford = macchineprezzi.get(2);
    int pmazda = macchineprezzi.get(3);
    ArrayList <String> moto = new ArrayList<>();
    moto.add("Ducati");
    moto.add("Kawasaki");
    moto.add("Aprilia");
    moto.add("Yamaha");
 
   

    ArrayList <Integer> motoprezzi = new ArrayList<>();
    motoprezzi.add(2000);
    motoprezzi.add(3500);
    motoprezzi.add(1200);
    motoprezzi.add(1600);

    String ducati = moto.get(0);
    String kawasaki = moto.get(1);
    String aprilia = moto.get(2);
    String yamaha = moto.get(3);
    int pDucati = motoprezzi.get(0);
    int pKawasaki = motoprezzi.get(1);
    int pAprilia = motoprezzi.get(2);
    int pYamaha = motoprezzi.get(3);

    System.out.println("Gentile cliente, i modelli disponibili sono quelli di seguito elencati, con i rispettivi prezzi:\nAuto:\n"+volvo+" "+pvolvo+ "\n"+bmw+" "+pbmw+ "\n"+ford+" "+pford+ "\n"+mazda+" "+pmazda);
    System.out.println("Moto:\n"+ducati+" "+pDucati+ "\n"+kawasaki+" "+pKawasaki+ "\n"+aprilia+" "+pAprilia+ "\n"+yamaha+" "+pYamaha);






    // array o arraylist(nome, prezzo, ...) //ALESSIA
    // print
    // metodo per diminuire parametri(budget e prezzo)
    // if (storico.lunghezza >2) {
    // switch() {
    // }
    // case 1:
    // budget-posizione 1 qui viene scontato a metà
    // aggiungere prezzo speso in spesa
    // storico+ posizione 0
    // }
    // switch() {
    // }
    // case 1:
    // budget-posizione 1 risultato variabile public che richiamiamo sotto per
    // stampa
    // storico+ posizione 0 }
}

class Promozioni extends Catalogo {
    // salvo nel login il nuovo budget e storico
    // stampa dei get del login

}

class Acquisto {
    // main qui?
}