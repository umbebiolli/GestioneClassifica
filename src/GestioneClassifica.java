public class GestioneClassifica {
    private Persona[] classifica;
    private int max = 10;
    private int num_persone = 0;

    public GestioneClassifica() {
        classifica = new Persona[max];
    }

    public GestioneClassifica(Persona[] classifica, int max) {
        classifica = new Persona[max];
        this.max = max;
        for (int i = 0; i < classifica.length; i++) {
            this.classifica[i] = classifica[i];
            num_persone++;
        }
    }

    public GestioneClassifica(GestioneClassifica g) {
        classifica = new Persona[max];
        this.max = g.max;
        for (int i = 0; i < classifica.length; i++) {
            classifica[i] = new Persona(g.classifica[i].getNome(), g.classifica[i].getEtà(),
                    g.classifica[i].getPunteggio());
            num_persone++;
        }
    }

    public void addPersona(Persona persona) {
        Persona temp;
        if (num_persone != max) {
            for (int i = 0; i < classifica.length; i++) {
                classifica[num_persone] = new Persona(persona.getNome(), persona.getEtà(), persona.getPunteggio());
                num_persone++;
                if (persona.getPunteggio() > classifica[i].getPunteggio()) {
                    temp = classifica[i];
                    classifica[i] = classifica[i - 1];
                    classifica[i - 1] = temp;
                    temp = null;
                } else {
                    return;
                }
            }
        }
    }

    public void killPersona(String nome) {
        int i = 0;
        boolean r = false;
        while (i < num_persone && r == false) {
            if (classifica[i].getNome().equals(nome)) {
                r = true;
                num_persone--;
                for (int j = i; j < num_persone; j++) {
                    classifica[j] = classifica[j + 1];
                }
                classifica[--num_persone] = null;
            }
            i++;
        }
    }

    public double Media() {
        int media = 0;
        int somma = 0;
        int conta = 0;
        for (int i = 0; i < classifica.length; i++) {
            somma += classifica[i].getPunteggio();
            conta++;
        }
        media = somma / conta;
        return media;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < classifica.length; i++) {
            if (classifica[i] != null) {
                s += "Nome: " + classifica[i].getNome() + "\n" + "Età: " +
                        classifica[i].getEtà() + "\n" + "Punteggio: " +
                        classifica[i].getPunteggio() + "\n";
            }
        }
        return s;
    }
}
