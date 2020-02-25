package de.adorsys.opba.starter;

import de.adorsys.opba.consentapi.config.EnableConsentApi;
import de.adorsys.opba.db.config.EnableBankingPersistence;
import de.adorsys.opba.protocol.xs2a.EnableXs2aProtocol;
import de.adorsys.opba.protocol.xs2a.EnableXs2aSandboxProtocol;
import de.adorsys.opba.tppbankingapi.config.EnableBankingApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableConsentApi
@EnableBankingApi
@EnableXs2aProtocol
@EnableXs2aSandboxProtocol
@EnableBankingPersistence
@SpringBootApplication
@ComponentScan("de.adorsys.opba.consentapi")
@EnableConfigurationProperties
@SuppressWarnings("checkstyle:HideUtilityClassConstructor") // Springboot starter class is not an utility class
public class OpenBankingEmbeddedApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenBankingEmbeddedApplication.class, args);
    }
}
