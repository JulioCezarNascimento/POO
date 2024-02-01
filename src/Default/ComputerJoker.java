package Default;

public class ComputerJoker {

        public static void main(String[] args) {

            ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
                    String appEscolhido="???";

                    if(appEscolhido.equals("msn"))
                        smi = new MSNMenssenger();
                    else if(appEscolhido.equals("fbm"))
                        smi = new FacebookMensseger();
                    else if(appEscolhido.equals("tlg"))
                        smi = new Telegram();


                    smi.enviarMensagem();
                    smi.receberMensagem();
                }
        }




