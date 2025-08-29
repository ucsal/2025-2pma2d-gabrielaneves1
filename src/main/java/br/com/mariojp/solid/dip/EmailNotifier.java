package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailSender;

	public EmailNotifier(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void notify(String recipient, String message) {
		String subject = "Notificação importante";
		this.mailSender.send(recipient, subject, message);
	}
}
