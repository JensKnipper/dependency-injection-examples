package de.jensknipper.diexamples.framework.runtime;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"de.jensknipper.diexamples.common", "de.jensknipper.diexamples.framework.runtime"})
@Configuration
public class AppConfig {
}
