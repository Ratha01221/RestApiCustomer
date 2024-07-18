package org.ratha.restapiforcustomer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Optional<ModelCustomer> findById(Long id);

    ModelCustomer save(ModelCustomer customer);

    List<ModelCustomer> findAll();
    // Optionally, add custom query methods here
}
