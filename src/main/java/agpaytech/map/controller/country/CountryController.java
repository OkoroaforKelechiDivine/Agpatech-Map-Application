package agpaytech.map.controller.country;

import agpaytech.map.data.country.Country;
import agpaytech.map.exception.CountryException;
import agpaytech.map.repository.country.CountryServiceImpl;
import agpaytech.map.repository.country.StaticCountries;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")

public class CountryController {

    CountryServiceImpl countryService = new CountryServiceImpl();

    @PostMapping("/{name}")
    public StaticCountries findCountryByName(@PathVariable String name) throws CountryException {
        return countryService.findCountryByName(name);
    }

}
