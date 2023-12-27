package fr.pentagone.akcess.controller;

import fr.pentagone.akcess.dto.LightApplicationDTO;
import fr.pentagone.akcess.dto.LightApplicationIdDTO;
import fr.pentagone.akcess.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "https://editor.swagger.io/", maxAge = 3600)
public class ApplicationController {
    private static final Logger LOGGER = Logger.getLogger(ApplicationController.class.getName());
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService){
        this.applicationService = applicationService;
    }
    @PostMapping()
    public ResponseEntity<LightApplicationIdDTO> addApplication(@RequestBody LightApplicationDTO applicationDTO){
        LOGGER.info("Put an instruction..." + applicationDTO);
        return applicationService.addApplication(applicationDTO);
    }
}
