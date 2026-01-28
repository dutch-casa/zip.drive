package com.hd.zip.api.v1;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HealthController {

  @GetMapping("/api/v1/health")
  public Map<String, Boolean> health() {
    return Map.of("ok", true);
  }
}
