package develhope.esercizio72ControllerconGETcompleta;

import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

@RestController
@RequestMapping("/v2")
public class LocationWeatherController {

    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{provincia}")
    public User ciao(
            @PathVariable(value = "provincia", required = true) String provincia,
            @RequestParam(value = "nome", required = false) String nome,
            @RequestParam(value = "dataDiNascita", required = false) String dataDiNascita) {


        if (nome == null) {
            return new User();
        } else {
            String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
            User user = new User(nome, provincia, saluto, convertStringToDate(dataDiNascita));
            return user;
        }
    }

    private OffsetDateTime convertStringToDate(String dataDiNascita) {
        try {
            OffsetDateTime dDN = OffsetDateTime.parse(dataDiNascita);
            return dDN;
        } catch (DateTimeParseException exception) {
            System.out.println("inserisci correttamente la data di nascita");
            return null;
        }
    }
}