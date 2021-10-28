package bg.example.bgdeployment.service;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

  public boolean status() {
    return true;
  }
}
