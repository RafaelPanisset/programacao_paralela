public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando programa...");
        ThreadFelizAnoNovo felizAnoNovo = new ThreadFelizAnoNovo();
        ThreadFelizNatal felizNatal = new ThreadFelizNatal();

        felizNatal.start();

        felizAnoNovo.start();
    }
}