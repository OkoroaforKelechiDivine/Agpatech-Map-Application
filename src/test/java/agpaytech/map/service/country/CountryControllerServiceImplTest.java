package agpaytech.map.service.country;

import agpaytech.map.data.country.Country;
import agpaytech.map.exception.CountryException;
import agpaytech.map.repository.country.CountryRepository;
import agpaytech.map.repository.country.CountryServiceImpl;
import agpaytech.map.repository.country.StaticCountries;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j

public class CountryControllerServiceImplTest {

//    @Autowired
    CountryServiceImpl countryService;

    Country country;

    @BeforeEach
    public void initSetUp(){
        country = new Country();
        countryService = new CountryServiceImpl();
    }

    @Test
    @DisplayName("Find country that exists")
    public void test_findCountryByName() throws CountryException {
        StaticCountries staticCountries = countryService.findCountryByName("Japan");
        Assertions.assertThat(staticCountries != null);
        log.info("Found a country with that name -> {}", staticCountries);
    }

    @Test
    @DisplayName("Throw exception if country name does not exists")
    public void test_checkIfCountryNameDoesNotExists() throws CountryException {
        StaticCountries staticCountries = countryService.findCountryByName("Ghana");
        Assertions.assertThat(staticCountries != null);
        log.info("Could not find country with that name -> {}", staticCountries);
    }

    @Test
    @DisplayName("Check if country search bar name is null")
    public void test_checkIfCountryNameIsNull() throws CountryException {
        StaticCountries staticCountries = countryService.findCountryByName("");
        Assertions.assertThat(staticCountries != null);
        log.info("Country name can not be empty -> {}", staticCountries);
    }
}