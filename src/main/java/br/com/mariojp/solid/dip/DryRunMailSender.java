package br.com.mariojp.solid.dip;

public class DryRunMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("DRY RUN: O email não foi enviado, pois DRY_RUN está ativado");
    }

}
