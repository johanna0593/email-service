package com.blogpessoal.email_service.controller;

import com.blogpessoal.email_service.model.EmailRequest;
import com.blogpessoal.email_service.service.EmailService;
import com.blogpessoal.email_service.exception.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Email Service", description = "API para envio de e-mails do Blog Pessoal")
@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Operation(summary = "Enviar um e-mail")
    @PostMapping("/send")
    public ResponseEntity<Map<String, Object>> sendEmail(@RequestBody EmailRequest request) {
        emailService.sendEmail(request);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "E-mail enviado com sucesso!");
        response.put("to", request.getTo());

        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Verificar se o serviço está ativo")
    @GetMapping("/ping")
    public String ping() {
        return "📡 Email Service ativo e funcionando!";
    }
}
