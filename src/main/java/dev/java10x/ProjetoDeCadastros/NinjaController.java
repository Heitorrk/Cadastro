package dev.java10x.ProjetoDeCadastros;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }

}
