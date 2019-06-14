package hackathon.hackthonAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    public DataRepository dataRepository;

    public List<String> getTheGoodStuff() {
        return this.dataRepository.getTheGoodStuff();
    }
}
