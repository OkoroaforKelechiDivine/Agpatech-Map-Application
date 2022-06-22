package agpaytech.map.repository.country;

import agpaytech.map.data.country.Country;
import agpaytech.map.exception.CountryException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Service
@Slf4j
public class CountryRepositoryImpl implements CountryRepository{

//    @Autowired
//    private CountryRepository countryRepository;
    List<Country> countryDatabase = new ArrayList<>();

    @Override
    public StaticCountries findCountryByName(String name) throws CountryException {
        StaticCountries nameOfCountry = null;

        String nigeria = "Nigeria";
        String england = "England";
        String india = "India";
        String china = "China";
        String southAfrica = "South Africa";
        String japan = "Japan";
        String brazil = "Brazil";
        String switzerland = "Switzerland";

        if (name.equals(nigeria)){
            return StaticCountries.NIGERIA;
        }
        if (name.equals(england)){
            return StaticCountries.ENGLAND;
        }
        if (name.equals(india)){
            return StaticCountries.INDIA;
        }
        if (name.equals(china)){
            return StaticCountries.CHINA;
        }
        if (name.equals(southAfrica)){
            return StaticCountries.SOUTH_AFRICA;
        }
        if (name.equals(japan)){
            return StaticCountries.JAPAN;
        }
        if (name.equals(brazil)){
           return StaticCountries.BRAZIL;
        }
        if (name.equals(switzerland)){
           return StaticCountries.SWITZERLAND;
        }
        if (name.isEmpty()){
            throw new CountryException("Country name can not be empty");

        }
//        else{
//            throw new CountryException("Country with that name does not exist.");
//        }

        return nameOfCountry;
    }

    @Override
    public List<Country> findAllCountries() {
        return null;
    }

    @Override
    public void deleteCountryById(int id) {

    }

    @Override
    public void updateCountry(Country country) {

    }
}
