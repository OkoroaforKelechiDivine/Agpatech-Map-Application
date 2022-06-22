package agpaytech.map.service.country;

import agpaytech.map.exception.CountryException;
import agpaytech.map.repository.country.StaticCountries;
import org.springframework.stereotype.Service;

//@Service
public interface CountryService {
    StaticCountries findCountryByName(String name) throws CountryException;
}
