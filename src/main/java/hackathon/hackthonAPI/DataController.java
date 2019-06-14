package hackathon.hackthonAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/stuffILike")
    public ResponseEntity<List<String>> getTheGoodStuff() {
        return ResponseEntity.ok(this.dataService.getTheGoodStuff());
    }

    public String echoTest()
    {
        return "Hey I'm the Data Test!";
    }

}
