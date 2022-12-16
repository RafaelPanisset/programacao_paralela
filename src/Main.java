public class Main {
    public static void main(String[] args) {
        ThreadFelizAnoNovo felizAnoNovo = new ThreadFelizAnoNovo();
        ThreadFelizNatal felizNatal = new ThreadFelizNatal();

        felizNatal.start();
        felizAnoNovo.start();
    }
}