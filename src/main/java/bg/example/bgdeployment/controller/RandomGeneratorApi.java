package bg.example.bgdeployment.controller;

import bg.example.bgdeployment.service.RandomGeneratorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomGeneratorApi {

  private final RandomGeneratorService randomGeneratorService;

  public RandomGeneratorApi(
      RandomGeneratorService randomGeneratorService) {
    this.randomGeneratorService = randomGeneratorService;
  }

  @GetMapping("/randon-number")
  public ResponseEntity<?> randomNumber() {
    return new ResponseEntity<>(randomGeneratorService.generateRandom(), HttpStatus.OK);
  }
}
