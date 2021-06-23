package com.peterAlves.apiVendas.services;

import org.springframework.mail.SimpleMailMessage;

import com.peterAlves.apiVendas.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
