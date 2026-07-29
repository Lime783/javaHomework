package org.example.homework_13_Optional;

import java.util.Map;
import java.util.Optional;

public class AppConfig {
    static String getRequired(String key){
        Map<String, String> config = Map.of(
                "db.url", "jdbc:mysql://localhost:3306/app",
                "db.user", "admin"
        );
        Optional<String> value = Optional.ofNullable(config.get(key));
        return value.orElseThrow(() -> new IllegalArgumentException("No config for " + key));
    }
}
