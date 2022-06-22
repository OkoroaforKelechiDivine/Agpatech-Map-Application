package agpaytech.map.service.country;

import agpaytech.map.exception.CountryException;
import agpaytech.map.repository.country.StaticCountries;

public interface CountryService {
    StaticCountries findCountryByName(String name) throws CountryException;
}
