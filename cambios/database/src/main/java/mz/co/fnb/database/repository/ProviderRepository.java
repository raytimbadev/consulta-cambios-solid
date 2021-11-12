package mz.co.fnb.database.repository;

import mz.co.fnb.database.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider,Long> {
}
