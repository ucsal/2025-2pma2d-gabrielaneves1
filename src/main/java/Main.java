import br.com.mariojp.solid.dip.*;

public class Main {
	public static void main(String[] args) {
		MailSender mailSender = new SmtpMailSender();
		EmailNotifier notifier = new EmailNotifier(mailSender);
		User user = new User("nome_usuario", "usuario@otmail.com");
		notifier.notify(user.getEmail(), "Bem vindo ao nosso serviço");
	}
}
