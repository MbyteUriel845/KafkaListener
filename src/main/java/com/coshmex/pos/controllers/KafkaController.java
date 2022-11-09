package com.coshmex.pos.controllers;

import com.coshmex.pos.helper.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer productorKafka;

    @GetMapping("/{mensaje}")
    public String enviarMensaje(@PathVariable String mensaje) {
        String respuesta = "Proceso exitoso";
        try {
            productorKafka.send(mensaje);
        } catch (Exception e) {
            respuesta = "Error desconocido";
        }
        return respuesta;

    }

}
