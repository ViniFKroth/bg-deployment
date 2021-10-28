package bg.example.bgdeployment.service;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class RandomGeneratorService {

  public Long generateRandom() {
    return new Random().nextLong();
  }
}
