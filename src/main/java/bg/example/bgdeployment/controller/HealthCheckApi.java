package bg.example.bgdeployment.controller;

import bg.example.bgdeployment.service.HealthCheckService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/health")
public class HealthCheckApi {

  private final HealthCheckService healthCheckService;

  public HealthCheckApi(HealthCheckService healthCheckService) {
    this.healthCheckService = healthCheckService;
  }

  @GetMapping("")
  public ResponseEntity<?> status() {
    return healthCheckService.status() ? new ResponseEntity<>("All good", HttpStatus.OK)
        : new ResponseEntity<>("Unexpected Error", HttpStatus.SERVICE_UNAVAILABLE);
  }
}
