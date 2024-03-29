package fr.pentagone.akcess.controller;

import fr.pentagone.akcess.dto.InfoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Collections.emptyList;

@RestController
public class InfoController {

    @Value("${application.version}")
    private String info;

    @GetMapping(value = "/infos")
    public ResponseEntity<InfoDTO> applicationInfo(){
        return ResponseEntity.ok(new InfoDTO("Akcess", info, List.of("CVE-2023-45661", "CVE-2023-45623")));
    }
}
