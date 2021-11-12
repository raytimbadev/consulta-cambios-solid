package mz.co.fnb.services.impl;

import mz.co.fnb.database.entity.Provider;
import mz.co.fnb.database.repository.ProviderRepository;
import mz.co.fnb.services.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public Provider save(Provider provider) {
        return providerRepository.save(provider);
    }
}
