package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender{ 
    private final SmtpClient smtpClient;

    public SmtpMailSender() {
        this.smtpClient = new SmtpClient();
    }

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Enviando email via SMTP...");
        this.smtpClient.send(to, subject, body);
    }

}
