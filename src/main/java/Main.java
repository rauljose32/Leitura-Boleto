public class Main {

    public static void main(String[] args) {

        LeituraRetorno leituraRetorno = new LeituraRetornoBradesco();
        ProcessarBoletos boletos = new ProcessarBoletos(leituraRetorno);
        boletos.processar("bradesco-1.csv");
    }

}
