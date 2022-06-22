package agpaytech.map.repository.country;

import agpaytech.map.data.country.Country;
import agpaytech.map.exception.CountryException;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public interface CountryRepository {

    StaticCountries findCountryByName(String name) throws CountryException;

    List<Country> findAllCountries();

    void deleteCountryById(int id);

    void updateCountry(Country country);
}
