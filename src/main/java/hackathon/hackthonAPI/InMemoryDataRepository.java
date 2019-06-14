package hackathon.hackthonAPI;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class InMemoryDataRepository implements DataRepository {
    private List<String> TheGoodStuff = new ArrayList<>();

    @Override
    public List<String> getTheGoodStuff() {
        if (TheGoodStuff.isEmpty()) {
            TheGoodStuff.add("Cookies");
            TheGoodStuff.add("Pizza");
        }
        return this.TheGoodStuff;
    }
}
