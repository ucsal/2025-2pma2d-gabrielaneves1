package br.com.mariojp.solid.dip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class EmailNotifierTest {
 @Test
    void dryRunShouldNotThrowException() {
        MailSender dryRunSender = new DryRunMailSender();
        EmailNotifier notifier = new EmailNotifier(dryRunSender);
        Assertions.assertDoesNotThrow(() -> {
            notifier.notify("recipient@example.com", "Este é um teste de simulação, não deve lançar exceção.");
        });
    }
}
