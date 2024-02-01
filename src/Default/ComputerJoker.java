package Default;

public class ComputerJoker {

        public static void main(String[] args) {
            //abrindo MSN Messenger
            MSNMenssenger msn = new MSNMenssenger();
            msn.enviarMensagem();
            msn.receberMensagem();

            FacebookMensseger facebook = new FacebookMensseger();
            facebook.enviarMensagem();
            facebook.receberMensagem();

            Telegram telegram = new Telegram();
            telegram.enviarMensagem();
            telegram.receberMensagem();
        }
    }


