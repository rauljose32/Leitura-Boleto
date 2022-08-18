public class ProcessarBoletos {

    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public ProcessarBoletos() {
    }

    public void processar(String nomeArquivo){

        System.out.println(
                leituraRetorno.lerArquivo(nomeArquivo).toString()
        );
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

}
