package develhope.esercizio72ControllerconGETcompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class LocationWeatherController {

    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{provincia}")


    public String ciao(

            @PathVariable(value = "provincia", required = true) String provincia,
            @RequestParam(value = "nome", required = false) String nome) {


        if (nome == null) {
            return "hai dimenticato il nome";
        } else {
            String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
            User user = new User(nome, provincia, saluto);
            return user.toString();


        }
    }

}