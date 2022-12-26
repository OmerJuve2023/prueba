package proselecsac.proselec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador {
    @GetMapping("/index")
    public String hello() {
        return """
                hola que tal como estan,
                pero te dejo y me marcho para siempre
                """;
    }
}
