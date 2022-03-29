package com.att.forms.controller;

import com.att.forms.request.ItemServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ItemServerController {

    @PostMapping(value = "/itemServer", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ItemServer> postDatosPersonales(@RequestBody ItemServer itemServer){
        log.info("Request de form.io");
        log.info("{}", itemServer);
        return ResponseEntity.ok(itemServer);
    }
}