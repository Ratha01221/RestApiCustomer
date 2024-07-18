package org.ratha.restapiforcustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MockCustomerRepository implements CustomerRepository {

    private List<ModelCustomer> customers = new ArrayList<>();

    @Override
    public Optional<ModelCustomer> findById(Long id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public ModelCustomer save(ModelCustomer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public List<ModelCustomer> findAll() {
        return customers;
    }
}
