public class Persona {
    private String nome;
    private int età;
    private int punteggio;

    public Persona() {

    }

    public Persona(String nome, int età, int punteggio) {
        this.nome = nome;
        this.età = età;
        this.punteggio = punteggio;
    }

    public Persona(Persona persona) {
        this.nome = persona.nome;
        this.età = persona.età;
        this.punteggio = persona.punteggio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public int getEtà() {
        return this.età;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getPunteggio() {
        return this.punteggio;
    }

    public String toString() {
        return "La persona si chiama " + nome + " con un'età di " + età +
                " e con un punteggio di " + punteggio;
    }

    public boolean equals(Object obj) {
        boolean r = false;
        if (this == obj) { // indirizzo di memoria
            r = true;
            if (obj instanceof Persona) { // istanza di persona
                Persona p = (Persona) obj; // cast
                if (this.nome.equals(p.nome) || this.età == p.età) { // attributi significativi
                    r = true;
                }
            }
        }
        return r;
    }

}
