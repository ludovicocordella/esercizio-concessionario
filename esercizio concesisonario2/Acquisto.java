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
    int ultimoid=0;

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
        this.budget=nuovobud;
    }

    public void aggiornaspesa(int nuovaspesa) {
        this.spesa=nuovaspesa;
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

    public ArrayList<String> arrayLmacchine(){
        ArrayList<String> macchine = new ArrayList<String>();

        macchine.add("Volvo");
        macchine.add("BMW");
        macchine.add("Ford");
        macchine.add("Mazda");
         return macchine;
    }

    public ArrayList<Integer> arrayLmacchineprezzi(){
        ArrayList<Integer> macchineprezzi = new ArrayList<Integer>();
        macchineprezzi.add(20000);
        macchineprezzi.add(35000);
        macchineprezzi.add(12000);
        macchineprezzi.add(16000);

        return macchineprezzi;
    }

    

    public ArrayList<String> arrayLmoto(){
        ArrayList<String> moto = new ArrayList<>();
        moto.add("Ducati");
        moto.add("Kawasaki");
        moto.add("Aprilia");
        moto.add("Yamaha");
        return moto;
    }

    public ArrayList<Integer> arrayLmotoprezzi(){
        ArrayList<Integer> motoprezzi = new ArrayList<>();
        motoprezzi.add(2000);
        motoprezzi.add(3500);
        motoprezzi.add(1200);
        motoprezzi.add(1600);

        return motoprezzi;
    }



    public void stampalistaautomoto() {
        // array o arraylist(nome, prezzo, ...) 
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

    // metodo per diminuire parametri(budget e prezzo)

    

    //metodo con switch
    void sceltaclienteSwitch(){
        ArrayList<String> macchine = arrayLmacchine();
        ArrayList<Integer> macchineprezzi = arrayLmacchineprezzi();
        //aggiungere moto
        Scanner numeri = new Scanner(System.in);
        System.out.println("scrivere i vari println con le sclete associate ");
        System.out.println("premere 1 per "+ macchine.get(0));


        int menu = numeri.nextInt();
        switch(menu){
            case 1:
            aggiungiveicolo(macchine.get(0));
            aggiornabudget(budget - macchineprezzi.get(0));
            aggiornaspesa(spesa+macchineprezzi.get(0));
            break;

            //fare gli altri casi

        }
    }

    void sceltacliente(){
        

        if (getStorico().size()<2){
            sceltaclienteSwitch();
        } else{
            
            System.out.println("sopra a 2");
            //stampa questo all'infinito (andrà bloccato il while nel main che è sempre true per prova)

            }
        
    }
    

    
}

class Promozioni extends Catalogo { //qui riprendiamo lo switch sopra ma lo facciamo con un metodo di macchine prezzi e moto prezzi che fa .set  dull'arraylist e dimezza ii prezzi
    public Promozioni (String nome, String password, int budget) {
        super(nome, password, budget);
    }
// salvo nel login il nuovo budget e storico
// stampa dei get del login
    void sceltaclienteSwitch(){
        
    }


}


class Acquisto {

      

    public static void main(String[] args) {
        

        Scanner parole = new Scanner(System.in);
        Scanner numeri = new Scanner(System.in);

        System.out.println("registrati");
        System.out.println("inserisci nome");
        String rispostaNome = parole.nextLine();
        System.out.println("inserisci password");
        String rispostaPass = parole.nextLine();
        System.out.println("inserisci budget");
        int rispostaBudget = numeri.nextInt();
        
       
        
 

        Catalogo catalogo = new Catalogo(rispostaNome, rispostaPass, rispostaBudget);
        catalogo.controllologin();
        catalogo.stampalistaautomoto();
        //System.out.println(catalogo.getId());
        while(true){
        catalogo.sceltacliente();
        System.out.println(catalogo.getStorico());
        System.out.println(catalogo.getBudget());
        System.out.println(catalogo.getSpesa());
        }
    }
    
}