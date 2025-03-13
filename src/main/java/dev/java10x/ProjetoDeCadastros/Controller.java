package dev.java10x.ProjetoDeCadastros;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }

}
