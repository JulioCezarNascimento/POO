package Default;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();

    protected void validarConetadoInternet(){
        System.out.println("Validando se está conectado a internet.");
    }
}