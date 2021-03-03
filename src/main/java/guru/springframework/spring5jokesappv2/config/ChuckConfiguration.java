package guru.springframework.spring5jokesappv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * This is a useful means for bringing external JARs into your application
 * 
 * ChuckNorrisQuotes is not a Spring component/bean. So when the application starts, Spring will not treat it as a Spring Managed Object and not add it to the application context so that we can autowire it in.
 * Therefore, we are declaring it as a bean in the @Configuration class. Now Spring will treat it as a Spring managed Object and wherever we do a @Autowired, Spring will do a DI of ChuckNorrisQuotes .
 * 
 * @author matt.mcfarlane
 *
 */
@Configuration
public class ChuckConfiguration {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
