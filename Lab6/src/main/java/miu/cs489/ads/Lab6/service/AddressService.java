package miu.cs489.ads.Lab6.service;

import miu.cs489.ads.Lab6.module.Address;
import miu.cs489.ads.Lab6.repo.AddressRepo;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService{
    private AddressRepo addressRepo;
    public AddressService(AddressRepo addressRepo){
        this.addressRepo = addressRepo;
    }
    @Override
    public Address save(Address address) {
        return addressRepo.save(address);
    }
}
