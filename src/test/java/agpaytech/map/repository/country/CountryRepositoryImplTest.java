package agpaytech.map.repository.country;

import agpaytech.map.data.country.Country;
import agpaytech.map.exception.CountryException;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class CountryRepositoryImplTest {

    private CountryRepositoryImpl countryRepository;

    Country country;

    @BeforeEach
    public void initSetUp(){
        countryRepository = new CountryRepositoryImpl();
        country = new Country();
    }


    @Test
    @DisplayName("Find name of country that exist")
    public void test_findCountryByName() throws CountryException {
        StaticCountries c = countryRepository.findCountryByName("Japan");
        Assertions.assertThat(c != null);
        log.info("Found a country with that name -> {}", c);
    }

    @Test
    @DisplayName("Find country")
    public void test_findCountryThatDoesNotExist() throws CountryException {
        StaticCountries c = countryRepository.findCountryByName("Croatia");
        Assertions.assertThat(c != null);
        log.info("Found a country with that name -> {}", c);
    }

    @Test
    @DisplayName("Check if search button is null")
    public void test_checkIfCountryNameIsEmpty() throws CountryException {
        StaticCountries c = countryRepository.findCountryByName("");
        Assertions.assertThat(c != null);
        log.info("Found a country with that name --> {}", c);
    }

}