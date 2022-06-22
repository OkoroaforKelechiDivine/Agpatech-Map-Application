package agpaytech.map.repository.country;

import agpaytech.map.data.country.Country;
import agpaytech.map.exception.CountryException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CountryRepository {
    List<Country> countryDatabase = new ArrayList<>();
    StaticCountries findCountryByName(String name) throws CountryException;
}
