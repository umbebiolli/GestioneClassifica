public class App {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona("Umberto", 17, 10);
        Persona p1 = new Persona("Mattia", 16, 8);
        Persona p2 = new Persona("Genni", 60, 5);
        Persona p3 = new Persona("Genni", 60, 5);
        System.out.println(p);
        System.out.println(p1.getNome());
        System.out.println(p2.getEtà());

        GestioneClassifica classifica = new GestioneClassifica();
        classifica.addPersona(p);
        classifica.addPersona(p1);
        System.out.println(classifica);
        classifica.killPersona("Umberto");
        System.out.println("Classifica eliminata" + "\n" + classifica);
        System.out.println(p1.equals(p3));
    }
}