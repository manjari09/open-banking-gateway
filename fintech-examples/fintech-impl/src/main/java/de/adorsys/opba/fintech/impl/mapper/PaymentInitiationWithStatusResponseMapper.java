package de.adorsys.opba.fintech.impl.mapper;

import de.adorsys.opba.fintech.api.model.generated.PaymentInitiationWithStatusResponse;
import de.adorsys.opba.tpp.pis.api.model.generated.PaymentInformationResponse;
import org.mapstruct.Mapper;

@Mapper(implementationPackage = "de.adorsys.opba.fintech.impl.mapper.generated")
public abstract class PaymentInitiationWithStatusResponseMapper {
    public abstract PaymentInitiationWithStatusResponse mapFromTppToFintech(PaymentInformationResponse response);
}
